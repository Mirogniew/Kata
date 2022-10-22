package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EndingTest {
    @Test
    public void test1() {
        assertTrue(Ending.solution("ninja", "ja"));
    }

    @Test
    public void test2() {
        assertFalse(Ending.solution("samurai", "ono"));
    }

    @Test
    public void test3() {
        assertTrue(Ending.solution("Eda", "Eda"));
    }

}
