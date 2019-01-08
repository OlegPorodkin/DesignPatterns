package behavioral.iterator.refactoring.iterators;

import behavioral.iterator.refactoring.social_networcs.Facebook;
import behavioral.iterator.refactoring.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String email;
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<String>();
    private List<Profile> profiles = new ArrayList<Profile>();

    public FacebookIterator(Facebook facebook, String email, String type) {
        this.facebook = facebook;
        this.email = email;
        this.type = type;
    }

    private void lazyInit(){
        if(emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyInit();
        return emails.size() > currentPosition;
    }

    @Override
    public Profile getNext() {
        if (!hasNext()){
            return null;
        }
        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfileFromFacebook(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
