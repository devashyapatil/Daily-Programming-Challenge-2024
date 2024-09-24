import java.util.*;
class Day15 {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
             return 0;

        int maxi = Integer.MIN_VALUE;

        Set<Character> set = new HashSet < > ();
        int l = 0;
        
        for (int i=0; i<s.length(); i++) 
        {
            if (set.contains(s.charAt(i)))
            {
                while (l < i && set.contains(s.charAt(i))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(s.charAt(i));
            maxi = Math.max(maxi, i - l + 1);
        }
        return maxi;
    }
}
