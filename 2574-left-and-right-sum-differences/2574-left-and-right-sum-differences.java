class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] sum=new int[nums.length];
        int r=0;
        for(int i : nums) r+=i;
        int l=0;
        for(int i=0;i<nums.length;i++){
            r=r-nums[i];
            sum[i]=Math.abs(l-r);
            l+=nums[i];
        }
        return sum;
    }
}