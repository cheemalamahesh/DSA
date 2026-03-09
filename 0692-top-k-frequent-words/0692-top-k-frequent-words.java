class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String ,Integer> map=new HashMap<>();
        TreeMap<Integer,List<String>>t=new TreeMap<>(Collections.reverseOrder());
        for(String i : words){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            int key =entry.getValue();
            String val=entry.getKey();
            if(!t.containsKey(key)){    //if words have same freq so we use list<string>
                t.put(key,new ArrayList<>());
            }
            t.get(key).add(val);
        }
        ArrayList<String> l =new ArrayList<>();
        for(Map.Entry<Integer,List<String>> entry : t.entrySet()){
           List<String> w=entry.getValue();
           Collections.sort(w);    // soert in lexicographical order
           for(String i : w){
                if(l.size()<k){  //checking size list to maintain the k most words 
                    l.add(i);
                }else{
                    break;
                }
            }

        }
        return l;
    }
}