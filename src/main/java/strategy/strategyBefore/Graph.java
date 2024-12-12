package strategy.strategyBefore;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {
    private HashMap<Integer, LinkedList<Integer>> adjacencyList;
    private final Integer V;

    public Graph(Integer size) {
        if (size <= 0) throw new IllegalArgumentException();
        adjacencyList = new HashMap<>();
        for (int i = 0; i < size; i++) {
            adjacencyList.put(i, new LinkedList<>());
        }
        V = size;
    }

    public Set<Integer> allNodes() {
        return adjacencyList.keySet();
    }

    public LinkedList<Integer> nextNodes(Integer node) {
        return this.adjacencyList.get(node);
    }

    public void addEdge(Integer node1, Integer node2) {
        adjacencyList.get(node1).add(node2);
    }


    public Integer getV() {
        return V;
    }
}
