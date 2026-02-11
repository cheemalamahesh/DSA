class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>l=new ArrayList<>();
        char[] a=new char[n*2];
        gen(a,n,0,0,0,l);
        return l;
    }
    
    public void gen(char[] a,int n,int op,int cl,int idx,ArrayList<String> l){
        if(idx==2*n){
           
            l.add(new String(a));
            return ;
        }
        if(op<n){
            a[idx]='(';
            gen(a,n,op+1,cl,idx+1,l);
        }
        if(cl<op){
            a[idx]=')';
            gen(a,n,op,cl+1,idx+1,l);
        }
    }
}