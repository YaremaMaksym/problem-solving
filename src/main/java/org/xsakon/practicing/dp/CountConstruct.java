package org.xsakon.practicing.dp;

import java.util.HashMap;

public class CountConstruct {
    public static void main(String[] args) {
        System.out.println(countConstruct("purple", new String[] {"pur", "p", "ur", "le", "purpl"}, new HashMap<>())); // 2
        System.out.println(countConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}, new HashMap<>())); // 1
        System.out.println(countConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}, new HashMap<>())); // 0
        System.out.println(countConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}, new HashMap<>())); // 4
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
                new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}, new HashMap<>())); // 0
    }

    static int countConstruct(String target, String[] wordBank, HashMap<String, Integer> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) return 1;

        int totalCount = 0;

        for (String word : wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                int numWaysForRest = countConstruct(suffix, wordBank, memo);
                totalCount += numWaysForRest;
            }
        }

        memo.put(target, totalCount);
        return totalCount;
    }
}
