class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int idx=1;
        int cnt=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                cnt++;
                if(cnt<=2){
                    nums[idx++]=nums[i];
                }
            }else{
                nums[idx++]=nums[i];
                cnt=1;
            }
        }
        return idx;
    }
}