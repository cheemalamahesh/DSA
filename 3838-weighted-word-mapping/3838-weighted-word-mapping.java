class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str=new StringBuilder();
        for(String c : words){
            int n=c.length();
            int cnt=0;
            for(int i=0;i<n;i++){
                cnt+=weights[(c.charAt(i)-'a')];
            }
            char ch=(char)('z'-(cnt%26));
            str.append(ch);
        }
        return str.toString();
    }
}