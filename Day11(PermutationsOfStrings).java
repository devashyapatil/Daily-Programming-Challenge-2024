import java.util.*;

class Day11 {
    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();
        backtrack(chars, 0, result);
        return result;
    }
    
    private static void backtrack(char[] chars, int pos, List<String> result) {
        if (pos == chars.length - 1) {
            result.add(new String(chars));
        } else {
            for (int i = pos; i < chars.length; i++) {
                swap(chars, pos, i);
                backtrack(chars, pos + 1, result);
                swap(chars, pos, i); 
            }
        }
    }

    public static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
