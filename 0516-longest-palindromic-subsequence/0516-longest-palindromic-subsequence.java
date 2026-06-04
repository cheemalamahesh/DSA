class Solution {
    static int dp[][];
    public int longestPalindromeSubseq(String s) {
        String a=new StringBuilder(s).reverse().toString(); 
        int n=s.length();
        dp=new int[n+1][n+1];
        for(int[] i : dp){
            Arrays.fill(i,-1);
        }
        return fun(s,n-1,a,n-1);
        
    }

    public int fun(String s,int i,String a,int j){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==a.charAt(j)) return dp[i][j]=1+fun(s,i-1,a,j-1);
        return dp[i][j]=Math.max(fun(s,i-1,a,j),fun(s,i,a,j-1));
    }
}