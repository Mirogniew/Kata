package org.example.Codewars;

public class camelCase {
    public String camelCase(String camel) {
        String[] words = camel.split("[-_ ]");
        for (int i = 0; i < words.length; i++) {
            char temp[] = words[i].toCharArray();
            if (i == 0) {
                temp[0] = Character.toLowerCase(temp[0]);
            } else {
                temp[0] = Character.toUpperCase(temp[0]);
            }
            for (int j = 1; j < temp.length; j++) {
                temp[j] = Character.toLowerCase(temp[j]);
            }
            words[i] = new String(temp);
        }
        return String.join("", words);
    }
}
