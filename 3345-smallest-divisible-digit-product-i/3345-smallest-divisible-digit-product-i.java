class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int p=1;
            int m=n;
            while(m>0){
                int rem=m%10;
                p*=rem;
                m/=10;
            }
            if(p%t==0) return n;
            n++;
        }
    }
}