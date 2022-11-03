package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrollsTest {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", Trolls.disemvowel("This website is for losers LOL!"));
    }
}

