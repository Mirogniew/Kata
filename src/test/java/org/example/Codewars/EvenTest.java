package org.example.Codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", Even.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
