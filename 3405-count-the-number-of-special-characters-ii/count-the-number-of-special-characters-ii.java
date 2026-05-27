import java.util.*;

class Solution {
    public int numberOfSpecialChars(String word) {

        Map<Character, List<Integer>> count = new HashMap<>();

        int inx = 0;

        Set<Character> set = new HashSet<>();

        for (char a : word.toCharArray()) {
            set.add(a);
        }

        for (char a : word.toCharArray()) {

            if (count.containsKey(a)) {

                count.get(a).add(inx++);

            } else {

                List<Integer> list = new ArrayList<>();
                list.add(inx++);

                count.put(a, list);
            }
        }

        int result = 0;

        for (char ch : set) {

            if (Character.isLowerCase(ch)) {

                char upper = Character.toUpperCase(ch);

                if (count.containsKey(upper)) {

                    List<Integer> lowerList = count.get(ch);
                    List<Integer> upperList = count.get(upper);

                    int lastLowerIndex =
                            lowerList.get(lowerList.size() - 1);

                    int firstUpperIndex =
                            upperList.get(0);

                    if (firstUpperIndex > lastLowerIndex) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}