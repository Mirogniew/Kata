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
