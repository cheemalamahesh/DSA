class Solution {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n;i+=2*k){
            int st=i;
            int end=Math.min(i+k-1,n-1);
            while(st<end){
                char t=ch[st];
                ch[st]=ch[end];
                ch[end]=t;
                st++;
                end--;
            }
        }
        return new String(ch);
    }
}