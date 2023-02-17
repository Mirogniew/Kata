package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartesiaWalkTest {
    @Test
    public void test1() {
        assertTrue(CartesiaWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

    @Test
    public void test2() {
        assertFalse(CartesiaWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
    }

    @Test
    public void test3() {
        assertFalse(CartesiaWalk.isValid(new char[]{'w'}));
    }

    @Test
    public void test4() {
        assertFalse(CartesiaWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

}
