class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int i=0;
        int j=n-1;
        int l=0;
        int r=n-1;
        int[] res=new int[n];
        while(i<n && j>=0){
            if(nums[i]<pivot) res[l++]=nums[i];  //in res array from left - right keep track of less than number 
            if(nums[j]>pivot) res[r--]=nums[j]; ///in res array from right- left keep track of greater than value 
            i++;
            j--;
        }
        for(int x=l ;x<=r;x++) res[x]=pivot;  // exampl in res after placing the all values it lokk like 
                                              // 9 5 3 _ _ 12 14
                                              //       l  r       place with pivot 
        return res;
        
    }
}