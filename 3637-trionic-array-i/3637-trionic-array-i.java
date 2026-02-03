class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i+1<n && nums[i]<nums[i+1]){  // first increasing order 
            i++;
        }
        if(i==0 || i==n-1 ) return false; //if there is node increasing fisrt part || if there is only increasing it is false
        while(i+1<n && nums[i]>nums[i+1]){  //second part decresaing 
            i++;  
        }
        if(i==n-1) return false;    // there only decreasing part after increasing return false
        while(i+1<n && nums[i]<nums[i+1]){  //third for increasing order
            i++;
        }
        if(i==n-1) return true;    // all values over return true;
        return false;  // in case we got decresing order it is false
    }
}