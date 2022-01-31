package org.yuyuan;

public interface Car {
    public int getMaxSpeed();
    public default String getColor() {
        return "Transparent";
    }
}
