package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumStringsTest {
    @Test
    void test1() {
        assertEquals("148", SumStrings.sum("19", "129"));
    }

    @Test
    void test2() {
        assertEquals("1998", SumStrings.sum("999", "999"));
    }

    @Test
    void test3() {
        assertEquals("13", SumStrings.sum("007", "06"));
    }
}
