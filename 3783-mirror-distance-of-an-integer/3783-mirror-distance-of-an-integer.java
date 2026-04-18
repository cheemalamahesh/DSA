class Solution {
    public int mirrorDistance(int n) {
        int m=n;
       int res=0;
       while(n>0){
        int rem=n%10;
        res=res*10+rem;
        n/=10;
       }
       return Math.abs(m-res);
    }
}