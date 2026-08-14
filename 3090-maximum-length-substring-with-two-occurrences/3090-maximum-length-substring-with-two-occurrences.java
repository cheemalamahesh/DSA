class Solution {
    public int maximumLengthSubstring(String s) {
        int len=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.get(s.charAt(j))>2) break;
                len=Math.max(len,j-i+1);
            }
        }
        return len;
    }
}