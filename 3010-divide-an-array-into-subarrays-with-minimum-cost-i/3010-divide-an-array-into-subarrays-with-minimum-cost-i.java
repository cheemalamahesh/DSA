class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        //nums[0] is first part it is fixed 
        for(int i=1;i<=n-2;i++){ // start of 2nd part  
            for(int j=i+1;j<=n-1;j++){ //start of 3rd part and it is non empty subarray
                int res=nums[0]+nums[i]+nums[j];
                ans=Math.min(ans,res);
            }
        }
       return ans; 
    }
}