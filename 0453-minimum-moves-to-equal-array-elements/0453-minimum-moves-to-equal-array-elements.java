class Solution {
    public int minMoves(int[] nums) {
     int sum=0;
     int min=Integer.MAX_VALUE;
     for(int i : nums){
        if(i<min){
            min=i;
        }
     }
     for(int i : nums){
        sum+=(i-min);
     }
     return sum;
    }
}