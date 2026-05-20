class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] ans=new int[n];
        int[] fq=new int[n+1];
        int cnt=0;
        for(int i=0;i<n;i++){
            fq[A[i]]++;
            if(fq[A[i]]==2) cnt++;
            fq[B[i]]++;
            if(fq[B[i]]==2) cnt++; 
            ans[i]=cnt;
        }
        return ans;
    }
}