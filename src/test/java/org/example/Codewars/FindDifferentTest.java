package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDifferentTest {
    @Test
    public void test1() {
        assertEquals(2, FindDifferent.stray(new int[]{1, 1, 2}));
    }
    @Test
    public void test2() {
        assertEquals(1, FindDifferent.stray(new int[]{1, 2, 2,2,2,2,2,2,2}));
    }

    @Test
    public void test3() {
        assertEquals(3, FindDifferent.stray(new int[]{2, 2, 2,2,2,2,2,2,3}));
    }
}
