class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] r=new int[n];
        int idx=0;
        k=k%n;
        for(int i=n-k;i<n;i++){
            r[idx++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            r[idx++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=r[i];
        }
    }
}