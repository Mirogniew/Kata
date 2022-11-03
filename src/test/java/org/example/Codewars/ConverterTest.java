package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    @Test
    public void basicTests() {
        assertEquals("One", Converter.switchItUp(1));
        assertEquals("Three", Converter.switchItUp(3));
        assertEquals("Five", Converter.switchItUp(5));
    }
}
