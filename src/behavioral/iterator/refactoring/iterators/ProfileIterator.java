package behavioral.iterator.refactoring.iterators;

import behavioral.iterator.refactoring.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
