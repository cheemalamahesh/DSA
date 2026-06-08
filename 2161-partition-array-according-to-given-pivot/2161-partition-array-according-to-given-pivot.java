class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        List<Integer> l3=new ArrayList<>();
        for(int i : nums){
            if(i<pivot) l1.add(i);
            else if(i>pivot) l2.add(i);
            else if(i==pivot) l3.add(i);
        }
        int[] b=new int[nums.length];
        int idx=0;
        for(int i : l1) b[idx++]=i;
        for(int i : l3) b[idx++]=i;
        for(int i : l2) b[idx++]=i;
      return b;

    }
}