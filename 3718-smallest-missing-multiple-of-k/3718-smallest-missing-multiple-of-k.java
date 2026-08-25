class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums) set.add(i);
        for(int i=1;i<=1000;i++){
            if(i%k==0 && !set.contains(i)) return i;
        }
       return -1; 
    }
}