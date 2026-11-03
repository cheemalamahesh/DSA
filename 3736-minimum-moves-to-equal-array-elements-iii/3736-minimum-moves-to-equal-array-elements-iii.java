class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int x=nums[n-1];
        int cnt=0;
        for(int i=0;i<n-1;i++){
            cnt+=(x-nums[i]);

        }
        return cnt;
    }
}