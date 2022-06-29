package org.example.kyu9;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    @Test
    public void test() {
        assertEquals("3/56", new Printer().printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));

    }
}
