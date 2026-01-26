class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> l1=new ArrayList<>();
        for(int i=1;i<n;i++){
            int diff=arr[i]-arr[i-1];
            if(diff<min){
                min=diff;
                l1=new ArrayList<>();
                List<Integer>l2=new ArrayList<>();
                l2.add(arr[i-1]);
                l2.add(arr[i]);
                l1.add(l2);
            }else if(diff==min){
                List<Integer>l2=new ArrayList<>();
                l2.add(arr[i-1]);
                l2.add(arr[i]);
                l1.add(l2);
            }
        }

        return l1;
    }
}