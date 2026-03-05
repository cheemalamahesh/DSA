class Solution {
    public int minOperations(String s) {
        int start0=0;
        int start1=0;
        for(int i=0;i<s.length();i++){
            char exp0=(i%2==0)? '0' : '1'; //010101
            char exp1=(i%2==0)? '1' : '0'; //101010
            if(s.charAt(i)!=exp0) start0++;
            if(s.charAt(i)!=exp1) start1++;
        }
        return Math.min(start0,start1); 
    }
}