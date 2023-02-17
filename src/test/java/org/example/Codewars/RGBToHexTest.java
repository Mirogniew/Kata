package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RGBToHexTest {


    @Test
    public void test0() {
        assertEquals("FFFFFF", RGBToHex.rgb(255, 255, 255));
    }

    @Test
    public void test1() {
        assertEquals("E14A99", RGBToHex.rgb(225, 74, 153));
    }
}
