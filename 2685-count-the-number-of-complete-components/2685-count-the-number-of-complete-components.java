class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int cnt = 0;
        boolean[] b = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!b[i]) {
                if (bfs(graph, i, b)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public boolean bfs(ArrayList<ArrayList<Integer>> graph, int s, boolean[] b) {

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        b[s] = true;

        int nodes = 0;
        int degreeSum = 0;

        while (!q.isEmpty()) {
            int x = q.poll();
            nodes++;
            degreeSum += graph.get(x).size();

            for (int U : graph.get(x)) {
                if (!b[U]) {
                    b[U] = true;
                    q.add(U);
                }
            }
        }

        int edges = degreeSum / 2;
        int expectedEdges = nodes * (nodes - 1) / 2;

        return edges == expectedEdges;
    }
}