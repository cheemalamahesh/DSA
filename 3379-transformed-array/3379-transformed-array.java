class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i]=nums[i];
            }else{
                int t=(i+nums[i])%n;
                if(t<0) t+=n;
                ans[i]=nums[t];
            }
        }
       return ans; 
    }
}