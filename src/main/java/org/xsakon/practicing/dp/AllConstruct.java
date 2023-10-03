package org.xsakon.practicing.dp;

import java.util.*;
import java.util.stream.Collectors;

public class AllConstruct {
    public static void main(String[] args) {
        System.out.println(allConstructV2("purple", new String[] {"pur", "p", "ur", "le", "purpl"}, new HashMap<>())); // 2
        System.out.println(allConstructV2("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd", "ef", "c"}, new HashMap<>())); // 1
        System.out.println(allConstructV2("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}, new HashMap<>())); // 0
        System.out.println(allConstructV2("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeez",
                new String[]{"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}, new HashMap<>())); // 0
    }

    public static List<List<String>> allConstruct(String target, String[] wordBank) {
        List<List<String>> result = new ArrayList<>();

        if (target.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }

        for (String word : wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = allConstruct(suffix, wordBank);
                List<List<String>> targetWays = suffixWays.stream()
                        .map(way -> {
                            way.add(0, word);
                            return way;})
                        .toList();

                result.addAll(targetWays);
            }
        }

        return result;
    }

    public static List<List<String>> allConstructV2(String target, String[] wordBank, Map<String, List<List<String>>> memo) {
        List<List<String>> result = new ArrayList<>();

        if (memo.containsKey(target)) return memo.get(target);
        if (target.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }

        for (String word : wordBank) {
            if (target.startsWith(word)) {
                String suffix = target.substring(word.length());
                List<List<String>> suffixWays = allConstructV2(suffix, wordBank, memo);
                List<List<String>> targetWays = suffixWays.stream()
                        .map(way -> {
                            way.add(0, word);
                            return way;})
                        .toList();

                result.addAll(targetWays);
            }
        }

        memo.put(target, result);
        return result;
    }
}
