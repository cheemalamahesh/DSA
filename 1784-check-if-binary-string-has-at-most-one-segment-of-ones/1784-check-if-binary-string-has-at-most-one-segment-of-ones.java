class Solution {
    public boolean checkOnesSegment(String s) {
        int n=s.length();
        int cnt=0;
        boolean f=false;
        boolean o=false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                if(f==false){
                    f=true;
                }else{
                    if(o==true) return false;
                }
            }else{
                o=true;
            }
        }
        return true;
    }
}