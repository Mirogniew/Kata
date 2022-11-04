package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DigitizeTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, Digitize.reverse(35231));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0}, Digitize.reverse(0));
    }
}
