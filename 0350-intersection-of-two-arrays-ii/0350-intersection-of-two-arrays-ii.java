class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int i : nums1) l1.add(i);
        for(int i : nums2){
            if(l1.contains(i)){
                l2.add(i);
                l1.remove(Integer.valueOf(i));
            }
        }
        int[] a=new int[l2.size()];
        for(int i=0;i<l2.size();i++){
            a[i]=l2.get(i);
        }
        return a;
    }
}