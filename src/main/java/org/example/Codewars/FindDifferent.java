/***
 * Every array has only one number that is different from the rest of array. Array always has at least 3 numbers in it.
 * Find different number.
 */

package org.example.Codewars;

public class FindDifferent {
    public static int stray(int[] number) {
        for (int i = 0; i + 1 < number.length; i++) {
            if (number[i] != number[i + 1] || number[i] != number[i + 2] || number[i + 1] != number[i + 2]) {
                if (number[i] == number[i + 1]) return number[i + 2];
                else if (number[i] == number[i + 2]) return number[i + 1];
                else return number[i];
            }
        }
        return 0;
    }
}
