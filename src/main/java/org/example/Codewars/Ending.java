/***
 * Check if string str ends with string ending
 */

package org.example.Codewars;

public class Ending {
    public static boolean solution(String str, String ending){
        StringBuilder temp = new StringBuilder();
        if (str.length()>=ending.length()){
            for (int i = 1; i < ending.length()+1; i++) {
                temp.insert(0, str.split("")[str.length() - i]);
            }
            return temp.toString().equals(ending);
        }
        return false;
    }
}
