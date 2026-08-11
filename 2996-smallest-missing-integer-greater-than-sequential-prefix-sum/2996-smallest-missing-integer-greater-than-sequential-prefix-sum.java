class Solution {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        HashSet<Integer> set=new HashSet<>();
        for(int i : nums) set.add(i);
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]+1) break;
            sum+=nums[i];
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
}