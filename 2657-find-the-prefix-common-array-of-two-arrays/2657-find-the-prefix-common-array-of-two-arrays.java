class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] c=new int[n];
        if(A[0]== B[0]) c[0]=1;
        for(int i=1;i<n;i++){
            int cnt=0;
            int[] c1=Arrays.copyOfRange(A,0,i+1);
            int[] c2=Arrays.copyOfRange(B,0,i+1);
            Arrays.sort(c1);
            Arrays.sort(c2);
            int p=0;
            int q=0;
            while(p<c1.length && q<c2.length){
                if(c1[p]==c2[q]){
                    cnt++;
                    p++;
                    q++;
                }else if(c1[p]<c2[q]){
                    p++;
                }else{
                    q++;
                }
            }
            c[i]=cnt;
        }
       return c; 
    }
}