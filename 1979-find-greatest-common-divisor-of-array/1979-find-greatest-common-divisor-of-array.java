class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int min = nums[0];
        int max = nums[n - 1];

        int ans = 1;

        for (int d = 1; d <= min; d++) {
            if (min % d == 0 && max % d == 0) {
                ans = d;
            }
        }

        return ans;
    }
}