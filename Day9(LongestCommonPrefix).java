import java.util.Arrays;

class Day9 {
    public String longestCommonPrefix(String[] strings) {
        Arrays.sort(strings);
        int n = strings.length;
        String str1 = strings[0];
        String str2 = strings[n-1];
        int indx = 0;
        while(indx<str1.length() && indx<str2.length()){
            if(str1.charAt(indx)==str2.charAt(indx)){
                indx++;
            }
            else{
                break;
            }
        } 
        return str1.substring(0,indx);
    }
}
