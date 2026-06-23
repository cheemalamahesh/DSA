class Solution {
    public int zigZagArrays(int n, int l, int r) {
        long m=1000000007L;
        r-=l;
        long[][] dp=new long[n][r+1];
        for(int i=0;i<=r;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<n;i++){
            long prev=0;
            if(i%2==0){
                for(int j=0;j<=r;j++){
                    dp[i][j]=prev;
                    prev=(prev+dp[i-1][j])%m;
                }
            }else{
                for(int j=r;j>=0;j--){
                    dp[i][j]=prev;
                    prev=(prev+dp[i-1][j])%m;
                }
            }
        }
        long ans=0;
        for(int j=0;j<=r;j++){
            ans=(ans+dp[n-1][j]*2)%m;
        }
        return (int)ans;
    }
}