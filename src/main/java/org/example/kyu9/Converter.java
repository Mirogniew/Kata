/**
 * When provided with a number between 0-9, return it in words.
 * <p>
 * Input :: 1
 * <p>
 * Output :: "One".
 **/

package org.example.kyu9;

public class Converter {
    public static String switchItUp(int number) {
        String result = "";
        switch (number) {
            case 0 -> result = "Zero";
            case 1 -> result = "One";
            case 2 -> result = "Two";
            case 3 -> result = "Three";
            case 4 -> result = "Four";
            case 5 -> result = "Five";
            case 6 -> result = "Six";
            case 7 -> result = "Seven";
            case 8 -> result = "Eight";
            case 9 -> result = "Nine";
        }
        return result;
    }
}

