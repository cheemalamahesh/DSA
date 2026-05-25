class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            if(nums[i]%2==0){
                for(int j=i+1;j<n;j++){
                    if(nums[j]%2!=0) cnt++;
                }
            }else{
                for(int j=i+1;j<n;j++){
                    if(nums[j]%2==0) cnt++;
                }
            }
            ans[idx++]=cnt;
        }
        return ans;
    }
}