class Solution {
    public boolean winnerSquareGame(int n) {
      //New Approach
        //T(C(N)==O(N**2)) and S(C(N)==O(N)) as it requires non contiguous memory allocation iteratively
        boolean dp []=new boolean[n+1];//dp array declare
        for (int i=0;i<=n;i++){//iterating throughh dp's initial Length
            if(dp[i])continue;//Goto next passed indx 
            for (int j=1;i+j*j<=n;j++){dp[i+j*j]=true;}}return dp[n];}}//Iterating through arr's squared length 
      //Old Approach
        // dp[0]=false;dp[1]=true;
        // for(int i=2;i<n+1;i++){
        //     for(int j=1;j*j<=i;j++){
        //         if(dp[i-j*j]==false)dp[i]=true;break;}return dp[n];}}}
