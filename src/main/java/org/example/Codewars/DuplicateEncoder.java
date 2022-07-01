/***
 The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

 Examples
 "din"      =>  "((("
 "recede"   =>  "()()()"
 "Success"  =>  ")())())"
 "(( @"     =>  "))(("
 ***/

package org.example.Codewars;

public class DuplicateEncoder {
    static String encode(String word) {
        StringBuilder answer = new StringBuilder();
        word = word.toLowerCase();
        for (char c : word.toCharArray()
        ) {
            int temp = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    temp++;
                }
            }
            if (temp == 1) answer.append("(");
            else answer.append(")");
        }
        return answer.toString();
    }
}
