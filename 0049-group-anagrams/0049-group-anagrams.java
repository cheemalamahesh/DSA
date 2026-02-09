class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String  c : strs){
            char[] ch=c.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(c);
        }
        return new ArrayList<>(map.values());
    }
}