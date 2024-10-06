class Day27 {
    public static void bfs(List<List<Integer>> graph, int S,
            List<Integer> par, List<Integer> dist) {
       
        Queue<Integer> q = new LinkedList<>();
        dist.set(S, 0);
        q.add(S);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neighbor : graph.get(node)) {
                if (dist.get(neighbor) == Integer.MAX_VALUE) {
                    par.set(neighbor, node);
               
                    dist.set(neighbor, dist.get(node) + 1);

                    q.add(neighbor);
                }
            }
        }
    }

    public static void prntShortDis(List<List<Integer>> graph, int S,
            int D, int V) {
       
        List<Integer> par = new ArrayList<>(Collections.nCopies(V, -1));

        List<Integer> dist = new ArrayList<>(Collections.nCopies(V, Integer.MAX_VALUE));

        bfs(graph, S, par, dist);

        if (dist.get(D) == Integer.MAX_VALUE) {
            System.out.println("Source and Destination are not connected");
            return;
        }

        List<Integer> path = new ArrayList<>();
        int currNode = D;
        path.add(D);
        while (par.get(currNode) != -1) {
            path.add(par.get(currNode));
            currNode = par.get(currNode);
        }

        for (int i = path.size() - 1; i>=0; i--){
            System.out.print(path.get(i) + " ");
        }
    }
}
