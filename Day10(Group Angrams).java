import java.util.*;
class Day10 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList<>();

            Map<String, List<String>> group = new HashMap<String, List<String>>();

            for (String s : strs) {
                char[] c = s.toCharArray();
                Arrays.sort(c);
                String word = String.valueOf(c);
                if (!group.containsKey(word)) group.put(word, new ArrayList<>());
                group.get(word).add(s);
            }

            return new ArrayList<>(group.values());
    }
}
