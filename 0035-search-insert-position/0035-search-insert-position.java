class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int idx=0;
        while(idx<n && target>nums[idx]){
            idx++;
        }
       return idx; 
    }
}