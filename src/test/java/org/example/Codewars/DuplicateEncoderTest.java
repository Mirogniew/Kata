package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEncoderTest {
    @Test
    public void test1() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
    }

    @Test
    public void test2() {
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}
