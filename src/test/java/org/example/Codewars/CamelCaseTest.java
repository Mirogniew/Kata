package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelCaseTest {
    @Test
    public void test1() {
        assertEquals("theStealthWarrior", new CamelCase().camelCase("The_stealth_warrior"));
    }

    @Test
    public void test2() {
        assertEquals("theStealthWarrior", new CamelCase().camelCase("the-stealth-warrior"));
    }

    @Test
    public void test3() {
        assertEquals("działamPoprawnie", new CamelCase().camelCase("DziaŁam poprawnie"));
    }
}
