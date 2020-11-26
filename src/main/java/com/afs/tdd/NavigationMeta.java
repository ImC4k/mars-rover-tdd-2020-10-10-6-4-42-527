package com.afs.tdd;

public class NavigationMeta {
    int locationX;
    int locationY;
    String direction;

    public NavigationMeta(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return this.locationY;
    }

    public String getDirection() {
        return this.direction;
    }

    public void moveOneSpace() {
        ++locationY;
    }
}
