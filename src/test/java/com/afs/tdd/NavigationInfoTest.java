package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationInfoTest {

    @Test
    public void should_return_E_when_rotateLeft_given_N() {
        //given
        NavigationInfo navigationInfo = new NavigationInfo(0, 0, "N");

        //when
        navigationInfo.rotateLeft();

        //then
        assertEquals("E", navigationInfo.getDirection());
    }

}
