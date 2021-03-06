package behavioral.iterator.refactoring.social_networcs;

import behavioral.iterator.refactoring.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
