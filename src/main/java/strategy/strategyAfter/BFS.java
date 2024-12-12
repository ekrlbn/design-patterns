package strategy.strategyAfter;

import java.util.LinkedList;

public class BFS implements Search{

    @Override
    public void graphSearch(Integer start, Integer dest, Graph graph) {
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
}
