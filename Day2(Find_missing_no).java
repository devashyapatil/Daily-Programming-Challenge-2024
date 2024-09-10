class Programming {
    public int MissingNumber(int []a, int N) {
        for(int i=1;i<=N;i++){
            int flag = 0;
            for(int j=0;j<N-1;j++){
                if(a[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
}
