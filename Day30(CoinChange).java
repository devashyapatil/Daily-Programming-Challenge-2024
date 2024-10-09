class Day30 {
    public int combination(int i,int j,int[] coins,int[][] dp){
        if(i==0){
            if(j % coins[0] == 0){
                return j/coins[0];
            }
            else{
                return (int) Math.pow(10,9);
            }
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int notTaken = 0 + combination(i-1,j,coins,dp);
        int Taken = (int) Math.pow(10,9);
        if(coins[i] <= j){
            Taken = 1 + combination(i,j-coins[i],coins,dp);
        }

        return dp[i][j] = Math.min(Taken,notTaken);
    }
    
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n][amount+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        int ans = combination(n-1,amount,coins,dp);
        if(ans >= (int)Math.pow(10,9)){
            return -1;
        }
        return ans;
    }
}
