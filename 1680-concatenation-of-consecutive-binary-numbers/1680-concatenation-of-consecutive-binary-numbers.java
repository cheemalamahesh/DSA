class Solution {
    public int concatenatedBinary(int n) {
        int digit=0;
        long result=0;
        long mod=(int)1e9+7;
        for(int i =1;i<=n;i++){
            if((i&(i-1))==0) digit++; //for each power of two digits increase 1-1,2-10,3-11,4-100 ..8-1000,9-1001....
            result=((result<<digit)|i)%mod; //moving  number bits left shift base on the digit of cur number and add again the number  
        }
        return (int)result;
        
    }
}