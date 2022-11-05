package org.example.Codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    @Test
    public void testNormalCondition() {
        assertEquals(9, Queue.queueTimeArrays(new int[]{2, 2, 3, 3, 4, 4}, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, Queue.queueTimeArrays(new int[]{}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, Queue.queueTimeArrays(new int[]{1, 2, 3, 4, 5}, 1));
    }

}
