class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int l=0;
        int h=n-1;
        while(l<h){
            if(numbers[l]+numbers[h]==target) return new int[]{l+1,h+1};
            if(numbers[l]+numbers[h]<target){
                l++;
            }else{
                h--;
            }
        }
        return new int[]{};
    }
}