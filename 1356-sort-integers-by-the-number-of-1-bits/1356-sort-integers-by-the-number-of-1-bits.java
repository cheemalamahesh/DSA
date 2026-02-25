class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        for(int i : arr){
            int b=Integer.bitCount(i);
            if(map.containsKey(b)){
                map.get(b).add(i);
            }else{
                ArrayList<Integer> l=new ArrayList<>();
                l.add(i);
                map.put(b,l);
            }
        }
        ArrayList<Integer> l1=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry: map.entrySet()){
            ArrayList<Integer> value=entry.getValue();
            Collections.sort(value);
            for(Integer num : value){
                l1.add(num);
            } 
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }
}