class Solution {
    public int numSteps(String s) {
        int cnt=0;
        int carry=0;
        for(int i=s.length()-1;i>0;i--){
            int bit =(s.charAt(i)-'0')+carry; 
             // convert char int number and plus carry for already came odd one
             // 1 is odd  next 1 came is become even 1+1 =10 so we maitain carry
            if(bit==1){
                cnt+=2;   //for add 1 and divided by 2 
                carry=1;
            }else{     // for even direct dividee by 2
                cnt+=1;
            }
        }
     return cnt+carry;
    }
}