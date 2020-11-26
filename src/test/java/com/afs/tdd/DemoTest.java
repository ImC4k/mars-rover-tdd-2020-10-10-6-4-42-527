package com.afs.tdd;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    public void should_return_y_plus_1_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");

        //when
        NavigationMeta actual = marsRover.executeCommands(Stream.of("M").collect(Collectors.toList()));

        //then
        assertEquals(0, actual.getX());
        assertEquals(1, actual.getY());
        assertEquals("N", actual.getDirection());
    }


}
