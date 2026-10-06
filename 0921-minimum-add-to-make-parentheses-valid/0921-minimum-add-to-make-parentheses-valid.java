class Solution {
    public int minAddToMakeValid(String s) {
        int op=0;
        int res=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                op++;
            }else{
                if(op==0){
                    res++;
                }else{
                    op--;
                }
            }
        }
        return res+op;
    }
}