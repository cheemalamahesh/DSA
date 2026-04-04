class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int z=0;
        int o=0;
        int t=0;
        for(int i : nums){
            if(i==0){
                z++;
            }else if(i==1){
                o++;
            }else{
                t++;
            }
        }
        int idx=0;
        while(z>0 && idx<n){
            nums[idx++]=0;
            z--;
        }
        while(o>0 && idx<n){
            nums[idx++]=1;
            o--;
        }
        while(t>0 && idx<n){
            nums[idx++]=2;
            t--;
        }
        
    }
}