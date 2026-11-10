import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        List<String> common = new ArrayList<>();

        for (char ch : words[0].toCharArray()) {
            common.add(String.valueOf(ch));
        }

        for (int i = 1; i < words.length; i++) {
            List<String> temp = new ArrayList<>();

            for (char ch : words[i].toCharArray()) {
                String s = String.valueOf(ch);

                if (common.contains(s)) {
                    temp.add(s);
                    common.remove(s);
                }
            }

            common = temp;
        }

        return common;
    }
}