package com.afs.tdd;

import java.util.List;

public class MarsRover {
    private NavigationMeta navigationMeta;
    public MarsRover(int locationX, int locationY, String direction) {
        this.navigationMeta = new NavigationMeta(locationX, locationY, direction);
    }

    public NavigationMeta executeCommands(List<String> commands) {
        commands.forEach(this::executeCommand);
        return this.navigationMeta;
    }

    private void executeCommand(String command) {
        navigationMeta.moveOneSpace();
    }
}
