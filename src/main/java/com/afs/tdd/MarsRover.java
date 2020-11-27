package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private static final String LEFT = "L";
    private static final String RIGHT = "R";
    private static final String MOVE = "M";
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
            case MOVE: navigationInfo.moveOneSpace(); break;
            default:
        }
    }
}
