class Day22 {
    public static  int firstElement(int arr[], int n, int k) {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i=0; i<n; i++) {

            int a = 0;
            if(countMap.get(arr[i]) != null){
                a = countMap.get(arr[i]);
            }       

            countMap.put(arr[i], a+1);
        }
        
        for (int i=0; i<n; i++){
            if (countMap.get(arr[i]) == k) {
                return arr[i];
            }
        }
        return -1;
    }
}
