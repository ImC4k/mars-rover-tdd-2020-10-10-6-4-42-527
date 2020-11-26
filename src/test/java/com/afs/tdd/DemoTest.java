package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    public void should_return_0_1_N_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        NavigationInfo actual = marsRover.executeCommands(Stream.of("M").collect(Collectors.toList()));

        //then
        assertEquals(0, actual.getX());
        assertEquals(1, actual.getY());
        assertEquals("N", actual.getDirection());
    }

    @Test
    public void should_return_0_0_W_when_executeCommands_given_0_0_N_and_L() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        NavigationInfo actual = marsRover.executeCommands(Stream.of("L").collect(Collectors.toList()));

        //then
        assertEquals(0, actual.getX());
        assertEquals(0, actual.getY());
        assertEquals("W", actual.getDirection());
    }
}
