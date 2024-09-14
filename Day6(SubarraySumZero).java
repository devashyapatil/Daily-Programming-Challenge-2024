import java.util.ArrayList;

class Day6 {
    public ArrayList<int[]> FindSubarraySumZero(int[] arr){
        int n = arr.length;
        ArrayList<int[]> ans = new ArrayList<>();

        int sum;

        for(int i=0;i<n;i++){
            sum = 0;
            for(int j=i;j<n;j++){
                sum = 0;
                if(sum == 0){
                    ans.add(new int[] {i,j});
                }
            }
        }
        return ans;
    }
}
