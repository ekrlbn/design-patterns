package strategy.strategyAfter;


public class GraphSearch {
    private Search search;

    public GraphSearch(Search search) {
        this.search = search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

     void search(int start, int end, Graph graph) {
        this.search.graphSearch(start, end, graph);
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
        graph.addEdge(7, 8);

        Search bfs = new BFS();
        GraphSearch graphSearch = new GraphSearch(bfs);
        graphSearch.search(0, 7, graph);

        System.out.println("\n");
        Search dfs = new DFS();

        graphSearch.setSearch(dfs);
        graphSearch.search(0, 8, graph);

    }

}
