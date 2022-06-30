/***
     Some internet Troll made a non funny joke and multiplied every letter in strings - Write a program to undo this
     evil work. Remember, that some words supposed to have two of the same letter in a row (like Hello)
 ***/


package org.example.Codewars;

public class Kata123 {
    public String makeUnique(String input) {
        //Character.toUpperCase(h);
        input = input + "/";
        char[] words = input.toCharArray();
        char[] temp = new char[words.length];
        StringBuilder builder = new StringBuilder();
        int j = 0;
        for (int i = 0; i < words.length - 1; i++, j++) {
            if (i == 0) {
                temp[j] = words[i];
            } else if (temp[j - 1] == words[i] & temp[j - 1] == words[i + 1]) {
                temp[j] = words[i];

            } else if (words[i] != temp[j - 1]) {
                temp[j] = words[i];
            } else {
                j--;
            }
            if (j > 1) { //pozwolenie na istnienie 2 takich samych znaków z rzędu jak "l" w słowie Hello
                if (temp[j - 2] == temp[j - 1] & temp[j - 1] == temp[j]) {
                    j--;
                }
            }
        }
        char[] temp2 = new char[j]; // tablica pomagająca w zmniejszeniu rozmiaru efektu końcowego
        System.arraycopy(temp, 0, temp2, 0, j);
        return new String(temp2);
    }
}

