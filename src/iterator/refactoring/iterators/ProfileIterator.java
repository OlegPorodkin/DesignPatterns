package iterator.refactoring.iterators;

import iterator.refactoring.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
