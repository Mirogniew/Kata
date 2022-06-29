package org.example.kyu9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class camelCaseTest {
    @Test
    public void test1() {
        assertEquals("theStealthWarrior", new camelCase().camelCase("The_stealth_warrior"));
    }

    @Test
    public void test2() {
        assertEquals("theStealthWarrior", new camelCase().camelCase("the-stealth-warrior"));
    }

    @Test
    public void test3() {
        assertEquals("działamPoprawnie", new camelCase().camelCase("DziaŁam poprawnie"));
    }
}
