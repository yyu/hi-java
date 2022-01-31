package org.yuyuan;

public class Civic implements Car {
    @Override
    public int getMaxSpeed() {
        return 180;
    }

    @Override
    public String getColor() {
        return "Solid";
    }
}
