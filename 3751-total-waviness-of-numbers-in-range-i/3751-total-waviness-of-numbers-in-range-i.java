class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=fun(i);
        }
       return ans; 
    }

    public int fun(int n){
        String s=Integer.toString(n);
        int m=s.length();
        if(m<3) return 0;
        int cnt=0;
        for(int i=1;i<m-1;i++){
            int a=s.charAt(i-1);
            int b=s.charAt(i);
            int c=s.charAt(i+1);
            if((b>a && b>c) || (b<a && b<c)) cnt++;
        }
        return cnt;
    }

}