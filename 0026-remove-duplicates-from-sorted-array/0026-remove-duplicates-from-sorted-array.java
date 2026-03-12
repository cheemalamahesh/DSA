class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        HashSet<Integer>set =new HashSet<>();
        int idx=0;
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i])){
                nums[idx++]=nums[i];
                set.add(nums[i]);
            }
        }
       return idx; 
    }
    
}