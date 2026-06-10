class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            // int rem=n%10;
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}