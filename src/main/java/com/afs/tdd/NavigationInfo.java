package com.afs.tdd;

public class NavigationInfo {
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    public static final String WEST = "W";
    public static final String NORTH = "N";
    int locationX;
    int locationY;
    String direction;

    public NavigationInfo(int locationX, int locationY, String direction) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.direction = direction;
    }

    public int getX() {
        return this.locationX;
    }

    public int getY() {
        return this.locationY;
    }

    public String getDirection() {
        return this.direction;
    }

    public void moveOneSpace() {
        switch (this.direction) {
            case SOUTH: --locationY; break;
            case EAST: ++locationX; break;
            case WEST: ++locationX; break;
            default: ++locationY;
        }
    }

    public void rotateLeft() {
        switch (this.direction) {
            case NORTH: this.direction = WEST; break;
            case SOUTH: this.direction = EAST; break;
            case WEST: this.direction = SOUTH; break;
            default: this.direction = NORTH;
        }
    }

    public void rotateRight() {
        switch (this.direction) {
            case NORTH: this.direction = EAST; break;
            case SOUTH: this.direction = WEST; break;
            case WEST: this.direction = NORTH; break;
            default: this.direction = SOUTH;
        }
    }
}
