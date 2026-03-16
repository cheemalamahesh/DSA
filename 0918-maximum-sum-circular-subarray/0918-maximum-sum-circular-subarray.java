class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int cur1=nums[0];
        int sum1=nums[0];
        int tol=0;
        for(int i : nums){
            tol+=i;
        }
        for(int i=1;i<n;i++){
            cur1=Math.max(nums[i],cur1+nums[i]);
            sum1=Math.max(sum1,cur1);
        }
        int cur2=nums[0];
        int sum2=nums[0];
        for(int i=1;i<n;i++){
            cur2=Math.min(nums[i],cur2+nums[i]);
            sum2=Math.min(sum2,cur2);
        }
        int normalsum=tol-sum2;
        if(sum1<0){
            return sum1;
        }else{
            return Math.max(normalsum,sum1);
        }
        
    }
}