class Solution {
    public boolean consecutiveSetBits(int n) {
        StringBuilder str=new StringBuilder();
        while(n>0){
            str.insert(0,n%2);
            n/=2;
        }
        String s=str.toString();
        int len =s.length();
        int cnt=0;
        int pair=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='1'){
                cnt++;
                if(cnt>1) pair+=1;
            }else{
                cnt=0;
            }
        }
       
        return (pair==1) ? true : false;
    }
}