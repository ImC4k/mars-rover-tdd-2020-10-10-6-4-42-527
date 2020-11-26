package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private NavigationInfo navigationInfo;
    public MarsRover(int locationX, int locationY, String direction) {
        this.navigationInfo = new NavigationInfo(locationX, locationY, direction);
    }

    public NavigationInfo executeCommands(List<String> commands) {
        commands.forEach(this::executeCommand);
        return this.navigationInfo;
    }

    private void executeCommand(String command) {
        switch (command) {
            case "L": navigationInfo.rotateLeft(); break;
            case "R": navigationInfo.rotateRight(); break;
            default: navigationInfo.moveOneSpace();
        }
    }
}
