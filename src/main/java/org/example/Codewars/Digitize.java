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
