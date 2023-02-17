/***
 * Make a manual hex translator for RGB values
 */

package org.example.Codewars;

public class RGBToHex {

    public static String rgb(int r, int g, int b) {
        return translate(r) + translate(g) + translate(b);
    }

    public static String translate(int decimal) {
        if (decimal < 0) decimal = 0;
        if (decimal > 255) decimal = 255;
        int small = decimal % 16;
        int bigger = (decimal - small) / 16;
        return stringitator(bigger) + stringitator(small);
    }

    public static String stringitator(int number) {
        return switch (number) {
            case 15 -> "F";
            case 14 -> "E";
            case 13 -> "D";
            case 12 -> "C";
            case 11 -> "B";
            case 10 -> "A";
            default -> String.valueOf(number);
        };
    }
}
