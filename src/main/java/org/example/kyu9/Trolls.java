/***Trolls are attacking your comment section!

 A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

 Your task is to write a function that takes a string and return a new string with all vowels removed.

 For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

 Note: for this kata y isn't considered a vowel.
 ***/


package org.example.kyu9;


public class Trolls {
    public static String disemvowel(String str) {
        return str.replaceAll("a|i|o|u|e|A|I|O|U|E", "");
    }

}
