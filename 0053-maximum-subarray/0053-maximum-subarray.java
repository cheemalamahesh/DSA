class Solution {
    public int maxSubArray(int[] nums) {
       // Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int cursum=0;
        for(int i: nums){
            cursum+=i;
            if(cursum>max){
                max=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
     
        return max;
        
    }
}