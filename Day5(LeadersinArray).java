import java.util.*;
class Day5 {
    public ArrayList<Integer> findleaders(int[] arr){
        int n = arr.length;
        int maxFromRight = arr[n-1];
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(maxFromRight);

        for(int i=n-2; i>=0; i--){
            if(maxFromRight < arr[i]){
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }    
}
