package org.example.kyu9;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces.
 * Spaces will be included only when more than one word is present.
 * <p>
 * Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */

public class StopSnippingMyWords {
    public String spinWords(String welcome) {
        String[] words = welcome.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 4) {
                words[i] = new StringBuffer(words[i]).reverse().toString();
                StringBuilder builder = new StringBuilder();
                for (char h : words[i].toCharArray()) {
                    builder.insert(0, h);
                }
            }
        }
        return String.join(" ", words);
    }
}