class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for(String i : words){
            boolean f=true;
            for(int j=0;j<i.length();j++){
                if(allowed.indexOf(i.charAt(j))==-1){
                    f=false;
                    break;
                }
            }
            if(f) cnt++;
        }
        return cnt;
    }
}