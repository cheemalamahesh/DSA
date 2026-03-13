class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alp=new int[26];
        for(char c : magazine.toCharArray()){
            alp[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(alp[c-'a']==0) return false;
            alp[c-'a']--;
        }
        return true;
    }
}