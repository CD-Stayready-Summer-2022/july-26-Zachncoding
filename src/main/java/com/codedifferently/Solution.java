package com.codedifferently;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String howManyLettersDoYouSee(String input) {
        String str = " ";
        Map<String, Integer> hashMap = new HashMap<>();
        String[] letters = str.split(" ");

        for (String letter : letters)
            if (hashMap.containsKey(letter))
                hashMap.put(letter, hashMap.get(letter) + 1);
            else
                hashMap.put(letter, 1);
        return null;
    }
}
