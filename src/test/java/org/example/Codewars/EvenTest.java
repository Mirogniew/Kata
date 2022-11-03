package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenTest {
    @Test
    public void exampleTest0() {
        assertEquals("odd", Even.oddOrEven(new int[]{2, 5, 34, 6}));
    }

    @Test
    public void exampleTest1() {
        assertEquals("even", Even.oddOrEven(new int[]{1, 5, 35, 65}));
    }
}
