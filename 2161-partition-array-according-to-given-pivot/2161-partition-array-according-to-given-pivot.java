class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int l=0;
        int r=n-1;
        int[] res=new int[n];
        while(i<n && j>=0){
            if(nums[i]<pivot) res[l++]=nums[i];
            if(nums[j]>pivot) res[r--]=nums[j];
            i++;
            j--;
        }
        for(int x=l ;x<=r;x++) res[x]=pivot;
        return res;
        
    }
}