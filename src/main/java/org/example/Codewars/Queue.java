/***
 * There is a queue for the self-checkout tills at the supermarket.
 * Your task is write a function to calculate the total time required for all the customers to check out!
 *
 * input
 * customers: an array of positive integers representing the queue. Each integer represents a customer,
 * and its value is the amount of time they require to check out.
 * n: a positive integer, the number of checkout tills.
 * output
 * The function should return an integer, the total time required.
 *
 * Important
 * Please look at the examples and clarifications below, to ensure you understand the task correctly :)
 *
 * Examples
 * queueTime([5,3,4], 1)
 * // should return 12
 * // because when there is 1 till, the total time is just the sum of the times
 *
 * queueTime([10,2,3,3], 2)
 * // should return 10
 * // because here n=2 and the 2nd, 3rd, and 4th people in the
 * // queue finish before the 1st person has finished.
 *
 * queueTime([2,3,10], 2)
 * // should return 12
 * Clarifications
 * There is only ONE queue serving many tills, and
 * The order of the queue NEVER changes, and
 * The front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.
 * N.B. You should assume that all the test input will be valid, as specified above.
 *
 * P.S. The situation in this kata can be likened to the more-computer-science-related idea of a thread pool,
 * with relation to running multiple processes at the same time: https://en.wikipedia.org/wiki/Thread_pool
 *
 */


package org.example.Codewars;

import java.util.Arrays;

public class Queue {
    public static int queueTime(int[] customers, int n) { //Solution using only basic functions
        if (customers.length == 0) return 0;
        else {
            int[] tillTimes = new int[n];
            int fastestQueue;
            int i;
            for (int customer : customers) {
                fastestQueue = 0;
                for (i = 0; i < tillTimes.length; i++) {
                    if (tillTimes[fastestQueue] >= tillTimes[i]) fastestQueue = i;
                }
                tillTimes[fastestQueue] += customer;
            }

            int solution = tillTimes[0];
            for (i = 0; i < tillTimes.length; i++) {
                if (solution <= tillTimes[i]) solution = tillTimes[i];
            }
            return solution;
        }
    }

    public static int queueTimeArrays(int[] customers, int n) { // Better solution with Arrays.sort()
        int[] result = new int[n];
        for (int customer : customers) {
            result[0] += customer;
            Arrays.sort(result);
        }
        return result[n - 1];
    }
}
