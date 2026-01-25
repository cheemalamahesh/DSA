class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1) return 0;
        Arrays.sort(nums); 
        int s=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int min=nums[i+k-1]-nums[i];
            s=Math.min(s,min);
        } 
        return s;     
    }
}