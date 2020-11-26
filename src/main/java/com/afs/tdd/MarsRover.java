package com.afs.tdd;

import java.util.List;

public class MarsRover {
    public static final String LEFT = "L";
    public static final String RIGHT = "R";
    private final NavigationInfo navigationInfo;
    
    public MarsRover(int locationX, int locationY, String direction) {
        this.navigationInfo = new NavigationInfo(locationX, locationY, direction);
    }

    public NavigationInfo executeCommands(List<String> commands) {
        commands.forEach(this::executeCommand);
        return this.navigationInfo;
    }

    private void executeCommand(String command) {
        switch (command) {
            case LEFT: navigationInfo.rotateLeft(); break;
            case RIGHT: navigationInfo.rotateRight(); break;
            default: navigationInfo.moveOneSpace();
        }
    }
}
