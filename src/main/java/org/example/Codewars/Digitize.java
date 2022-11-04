/***
 * Convert number to reversed array of digits
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 *
 * Example(Input => Output):
 * 35231 => [1,3,2,5,3]
 ***/
package org.example.Codewars;

public class Digitize {
    public static int[] reverse(long n) {
        String number = Long.toString(n);
        char[] numbers = number.toCharArray();
        int i = numbers.length;
        int[] answer = new int[i];
        for (int j = 0; j < i; j++) {
            answer[j] = Character.getNumericValue(numbers[i - j - 1]);
        }
        return answer;
    }
}
