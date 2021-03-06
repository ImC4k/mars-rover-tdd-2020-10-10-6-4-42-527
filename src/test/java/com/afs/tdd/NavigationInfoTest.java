package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NavigationInfoTest {

    @Test
    void should_return_W_when_rotateLeft_given_N() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "N");

        //when
        navigationInfo.rotateLeft();

        //then
        assertEquals("W", navigationInfo.getDirection());
    }

    @Test
    void should_return_E_when_rotateRight_given_N() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "N");

        //when
        navigationInfo.rotateRight();

        //then
        assertEquals("E", navigationInfo.getDirection());
    }

    @Test
    void should_return_N_when_rotateLeft_given_E() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "E");

        //when
        navigationInfo.rotateLeft();

        //then
        assertEquals("N", navigationInfo.getDirection());
    }

    @Test
    void should_return_S_when_rotateRight_given_E() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "E");

        //when
        navigationInfo.rotateRight();

        //then
        assertEquals("S", navigationInfo.getDirection());
    }

    @Test
    void should_return_E_when_rotateLeft_given_S() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "S");

        //when
        navigationInfo.rotateLeft();

        //then
        assertEquals("E", navigationInfo.getDirection());
    }

    @Test
    void should_return_W_when_rotateRight_given_S() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "S");

        //when
        navigationInfo.rotateRight();

        //then
        assertEquals("W", navigationInfo.getDirection());
    }

    @Test
    void should_return_S_when_rotateLeft_given_W() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "W");

        //when
        navigationInfo.rotateLeft();

        //then
        assertEquals("S", navigationInfo.getDirection());
    }

    @Test
    void should_return_N_when_rotateRight_given_W() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "W");

        //when
        navigationInfo.rotateRight();

        //then
        assertEquals("N", navigationInfo.getDirection());
    }

    @Test
    void should_return_0_1_N_when_moveOneSpace_given_0_0_N() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "N");

        //when
        navigationInfo.moveOneSpace();

        //then
        assertEquals("N", navigationInfo.getDirection());
        assertEquals(0, navigationInfo.getX());
        assertEquals(1, navigationInfo.getY());
    }

    @Test
    void should_return_0_negative1_S_when_moveOneSpace_given_0_0_S() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "S");

        //when
        navigationInfo.moveOneSpace();

        //then
        assertEquals("S", navigationInfo.getDirection());
        assertEquals(0, navigationInfo.getX());
        assertEquals(-1, navigationInfo.getY());
    }

    @Test
    void should_return_1_0_E_when_moveOneSpace_given_0_0_E() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "E");

        //when
        navigationInfo.moveOneSpace();

        //then
        assertEquals("E", navigationInfo.getDirection());
        assertEquals(1, navigationInfo.getX());
        assertEquals(0, navigationInfo.getY());
    }

    @Test
    void should_return_negative1_0_E_when_moveOneSpace_given_0_0_W() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "W");

        //when
        navigationInfo.moveOneSpace();

        //then
        assertEquals("W", navigationInfo.getDirection());
        assertEquals(-1, navigationInfo.getX());
        assertEquals(0, navigationInfo.getY());
    }

}
