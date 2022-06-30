package org.example.Codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata123Test {
    @Test
    public void test1() {
        assertEquals("String", new Kata123().makeUnique("SSttrriinngg"));
    }

    @Test
    public void test2() {
        assertEquals("Hello World", new Kata123().makeUnique("HHeelllloo  WWoorrlldd"));
    }

    @Test
    public void test3() {
        assertEquals("1234!_ ", new Kata123().makeUnique("11223344!!__  "));
    }

    @Test
    public void test4() {
        assertEquals("lol", new Kata123().makeUnique("lloll"));
    }

    @Test
    public void test5() {
        assertEquals("mniam", new Kata123().makeUnique("mniam"));
    }
}
