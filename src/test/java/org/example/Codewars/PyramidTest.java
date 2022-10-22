package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidTest {
    @Test
    public void test1() {
        assertEquals(1, Pyramid.Sum(1));
        assertEquals(74088, Pyramid.Sum(42));
    }
}
