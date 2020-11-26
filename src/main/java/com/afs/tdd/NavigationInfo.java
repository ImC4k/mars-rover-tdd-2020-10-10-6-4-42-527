package com.afs.tdd;

public class NavigationInfo {
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
            case "S": --locationY; break;
            case "E": ++locationX; break;
            case "W": --locationX; break;
            default: ++locationY;
        }
    }

    public void rotateLeft() {
        switch (this.direction) {
            case "N": this.direction = "W"; break;
            case "S": this.direction = "E"; break;
            case "W": this.direction = "S"; break;
            default: this.direction = "N";
        }
    }

    public void rotateRight() {
        switch (this.direction) {
            case "N": this.direction = "E"; break;
            case "S": this.direction = "W"; break;
            case "W": this.direction = "N"; break;
            default: this.direction = "S";
        }
    }
}
