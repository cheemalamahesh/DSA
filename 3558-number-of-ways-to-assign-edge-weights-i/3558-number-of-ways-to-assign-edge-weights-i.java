class Solution {
    public int height(List<List<Integer>> adj,int i,int par){
        int max=0;
        for(int j:adj.get(i)){
            if(j==par) continue;
            max=Math.max(max,height(adj,j,i));
        }
        return 1+max;
    }
    public int assignEdgeWeights(int[][] edges) {
        int mod=1000000007;
        int n=edges.length+1;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int i[]:edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        int h=height(adj,1,0)-1;
        int ans=1;
        for(int i=0;i<h-1;i++) ans=(ans*2)%mod;
        return ans;
    }
}