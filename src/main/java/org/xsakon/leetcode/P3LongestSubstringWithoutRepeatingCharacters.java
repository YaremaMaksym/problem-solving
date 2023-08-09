package org.xsakon.leetcode;

public class P3LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {

        StringBuilder str = new StringBuilder();
        int maxLength = 0;
        int startIndex = 0;
        char[] charArr = s.toCharArray();
        int i = 0;

        while(i < s.length()){
            Character ch = charArr[i];

            if (str.toString().contains(ch.toString())) {
                str.setLength(0);
                startIndex++;
                i = startIndex;
            }
            else {
                str.append(ch);

                if (str.length() > maxLength) {
                    maxLength = str.length();
                }

                i++;
            }
        }
        return maxLength;
    }
}
