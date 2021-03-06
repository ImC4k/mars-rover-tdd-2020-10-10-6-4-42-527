package com.afs.tdd;

public class NavigationInfo {
    private static final String SOUTH = "S";
    private static final String EAST = "E";
    private static final String WEST = "W";
    private static final String NORTH = "N";
    private int locationX;
    private int locationY;
    private String direction;

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
            case NORTH: ++locationY; break;
            case SOUTH: --locationY; break;
            case EAST: ++locationX; break;
            case WEST: --locationX; break;
            default:
        }
    }

    public void rotateLeft() {
        switch (this.direction) {
            case NORTH: this.direction = WEST; break;
            case EAST: this.direction = NORTH; break;
            case SOUTH: this.direction = EAST; break;
            case WEST: this.direction = SOUTH; break;
            default:
        }
    }

    public void rotateRight() {
        switch (this.direction) {
            case NORTH: this.direction = EAST; break;
            case EAST: this.direction = SOUTH; break;
            case SOUTH: this.direction = WEST; break;
            case WEST: this.direction = NORTH; break;
            default:
        }
    }
}
