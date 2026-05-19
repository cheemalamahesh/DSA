class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int x=0;
        int y=0;
        while(x<nums1.length && y<nums2.length){
            if(nums1[x] == nums2[y]){
                return nums1[x];
            }else if(nums1[x]<nums2[y]){
                x++;
            }else{
                y++;
            }
            
        }
        return -1;
    }
}