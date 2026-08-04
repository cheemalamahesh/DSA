class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i : nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        int[] a=new int[max+1];
        for(int i : nums) a[i]++;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(a[i]==0) l.add(i);
        }
        return l;
    }
}