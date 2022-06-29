package org.example.kyu9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopSnippingMyWordsTest {
    @Test
    public void test() {
        assertEquals("emocleW", new StopSnippingMyWords().spinWords("Welcome"));

    }

    @Test
    public void test2() {
        assertEquals("Hey wollef sroirraw", new StopSnippingMyWords().spinWords("Hey fellow warriors"));
    }

    @Test
    public void test3() {
        assertEquals("54321", new StopSnippingMyWords().spinWords("12345"));
    }

    @Test
    public void test4() {
        assertEquals("1234", new StopSnippingMyWords().spinWords("1234"));
    }
}