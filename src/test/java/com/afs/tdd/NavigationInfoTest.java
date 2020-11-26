package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationInfoTest {

    @Test
    public void should_return_W_when_rotateLeft_given_N() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "N");

        //when
        navigationInfo.rotateLeft();

        //then
        assertEquals("W", navigationInfo.getDirection());
    }

    @Test
    public void should_return_E_when_rotateRight_given_N() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "N");

        //when
        navigationInfo.rotateRight();

        //then
        assertEquals("E", navigationInfo.getDirection());
    }

    @Test
    public void should_return_N_when_rotateLeft_given_E() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "E");

        //when
        navigationInfo.rotateLeft();

        //then
        assertEquals("N", navigationInfo.getDirection());
    }

    @Test
    public void should_return_S_when_rotateRight_given_E() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "E");

        //when
        navigationInfo.rotateRight();

        //then
        assertEquals("S", navigationInfo.getDirection());
    }

}
