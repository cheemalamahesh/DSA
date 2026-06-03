class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> list=create(n,edges);
        boolean[] vis=new boolean[n];
        Arrays.fill(vis,false);
        List<Integer>ans=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            if(vis[i]==false){
                int cnt=bfs(list,vis,i);
                sum+=cnt;
                ans.add(cnt);
            }
        }
        return unreach(ans,sum);
        
    }

    public int bfs(List<List<Integer>> list,boolean[] vis,int i){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        vis[i]=true;
        int ans1=1;
        while(!q.isEmpty()){
            int x=q.poll();
            for(int z : list.get(x)){
                if(vis[z]==false){
                    ans1++;
                    vis[z]=true;
                    q.add(z);
                }
            }
        }
        return ans1;
    }

    public long unreach(List<Integer> ans,int sum){
        long total=1L*sum*(sum-1)/2;
        long count=0;
        for(int i : ans){
            count+=1L*i*(i-1)/2; 
        }
        return total-count;
    }

    public List<List<Integer>> create(int n,int[][] edges){
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int[] e : edges){
            int u=e[0];
            int v=e[1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        return l;
    }
}