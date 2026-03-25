class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        TreeMap<Integer,List<Integer>> m=new TreeMap<>(Collections.reverseOrder());
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int frq=entry.getValue();
            int val=entry.getKey();
            if (!m.containsKey(frq)) {
                m.put(frq, new ArrayList<>());
            }
            m.get(frq).add(val);
        }
        int[] r=new int[k];
        int idx=0;
        for(Map.Entry<Integer,List<Integer>> entry:m.entrySet()){
            for(int i : entry.getValue()){
                if(idx<k){
                    r[idx++]=i;
                }else{
                    break;
                }
            }
            if(idx==k) break;
        }
        return r;
    }
}