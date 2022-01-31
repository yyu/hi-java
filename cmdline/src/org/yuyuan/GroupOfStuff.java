package org.yuyuan;

public interface GroupOfStuff<T> {
    default int count() {
        return 0;
    }
}
