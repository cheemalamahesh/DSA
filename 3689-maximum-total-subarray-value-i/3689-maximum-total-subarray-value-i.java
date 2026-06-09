class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i : nums){
            min=Math.min(min,i);  
            max=Math.max(max,i); //by maintaining the max , min value throughout one subarray which is original array , in statment it clealy said that we use subarray mutliple times .thats why we return original array min,max value diff with k
        }
        min=max-min;
        return 1L*min*k;
    }
}