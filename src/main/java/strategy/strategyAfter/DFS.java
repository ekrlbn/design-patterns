package strategy.strategyAfter;

public class DFS implements Search {

    private void dfs(Integer start, Integer dest, boolean[] visited, Graph graph) {
        System.out.print(start + " ");
        if (start.equals(dest)) return;
        for (Integer next : graph.nextNodes(start)) {
            if (!visited[next]) dfs(next, dest, visited, graph);
        }
    }

    @Override
    public void graphSearch(Integer start, Integer dest, Graph graph) {
        boolean[] visited = new boolean[graph.getV()];
        visited[start] = true;
        dfs(start, dest, visited, graph);
    }
}
