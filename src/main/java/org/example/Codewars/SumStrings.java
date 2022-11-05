/***
 * Given the string representations of two integers, return the string representation of the sum of those integers.
 *
 * For example:
 *
 * sumStrings('1','2') // => '3'
 * A string representation of an integer will contain no characters besides the ten numerals "0" to "9".
 * The operation must be doable for biggest numbers without using 'BigInteger', 'BigDecimal', or 'BigNumber'!!!
 */


package org.example.Codewars;

public class SumStrings {
    public static String sum(String a, String b) {
        StringBuilder aBuilder = new StringBuilder(a);
        StringBuilder bBuilder = new StringBuilder(b);
        while (aBuilder.length() != bBuilder.length()) {
            if (aBuilder.length() < bBuilder.length()) aBuilder.insert(0, "0");
            else bBuilder.insert(0, "0");
        }
        b = bBuilder.toString();
        a = aBuilder.toString();
        String[] firstNumber = a.split("");
        String[] secondNumber = b.split("");
        String[] addition = new String[a.length() + 1];
        StringBuilder result = new StringBuilder();
        int firstInteger;
        int secondInteger;
        int takeMeOver = 0;
        for (int i = a.length(); i >= 0; i--) {
            if (i > 0) {
                firstInteger = Integer.parseInt(firstNumber[i - 1]);
                secondInteger = Integer.parseInt(secondNumber[i - 1]);
                if (firstInteger + secondInteger + takeMeOver > 9) {
                    addition[i] = String.valueOf(firstInteger + secondInteger + takeMeOver - 10);
                    takeMeOver = 1;
                } else {
                    addition[i] = String.valueOf(firstInteger + secondInteger + takeMeOver);
                    takeMeOver = 0;
                }
            }
            if (i == 0) {
                if (takeMeOver == 1) {
                    addition[0] = "1";
                } else addition[0] = "";
            }
        }
        for (String s : addition) {
            if (s.equals("0") && result.toString().equals("")) result = new StringBuilder();
            else result.append(s);
        }
        return result.toString();
    }
}
