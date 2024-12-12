package strategy.strategyBefore;


import java.util.LinkedList;

public class GraphSearch {

    public void bfs(Integer start, Integer dest, Graph graph) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(start);
        while (!stack.isEmpty()) {
            Integer node = stack.pop();
            System.out.print(node + " ");
            if (node.equals(dest)) return;
            for (Integer next : graph.nextNodes(node)) {
                if (!stack.contains(next)) {
                    stack.push(next);
                }
            }
        }
    }

    public void dfs(Integer start, Integer dest, Graph graph) {
        boolean[] visited = new boolean[graph.getV()];
        visited[start] = true;
        dfs(start, dest, visited, graph);
    }

    public void dfs(Integer start, Integer dest, boolean[] visited, Graph graph) {
        System.out.print(start + " ");
        if (start.equals(dest)) return;
        for (Integer next : graph.nextNodes(start)) {
            if (!visited[next]) dfs(next, dest, visited, graph);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);
        graph.addEdge(6, 7);
        GraphSearch graphSearch = new GraphSearch();
        graphSearch.bfs(1, 9, graph);
        System.out.println();
        graphSearch.dfs(1, 8, graph);

    }

}
