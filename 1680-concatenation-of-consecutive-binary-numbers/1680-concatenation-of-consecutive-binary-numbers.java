class Solution {
    public int concatenatedBinary(int n) {
        int digit=0;
        long result=0;
        long mod=(int)1e9+7;
        for(int i =1;i<=n;i++){
            if((i&(i-1))==0) digit++;
            result=((result<<digit)|i)%mod;
        }
        return (int)result;
        
    }
}