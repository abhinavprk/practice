package abhi.practice.graphs;

import java.util.*;

public class DepthFirstSearch {

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        // Fully connected graph with cycles
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 4, 5));
        graph.put(3, Arrays.asList(1, 6));
        graph.put(4, Arrays.asList(1, 2, 5, 6));
        graph.put(5, Arrays.asList(2, 4, 7));
        graph.put(6, Arrays.asList(3, 4, 7, 8));
        graph.put(7, Arrays.asList(5, 6, 8));
        graph.put(8, Arrays.asList(6, 7, 9));
        graph.put(9, List.of(8));

        // Display the graph
        graph.forEach((node, neighbors) -> System.out.println(node + " -> " + neighbors));


        System.out.println("DFS Traversal: ");
        dfs(0, graph);
        dfsOther(0, graph);
        dfsRecursive(0, graph, new HashSet<>());
        System.out.println();

        System.out.println("DFS Traversal: ");
        dfs(2, graph);
        dfsOther(2, graph);
        dfsRecursive(2, graph, new HashSet<>());
    }

    private static void dfs(int start, Map<Integer, List<Integer>> graph) {
        //visited will contain all the visited nodes
        Set<Integer> visited = new HashSet<>();
        //stack will contain all the children of visited nodes
        Deque<Integer> stack = new LinkedList<>();
        //Push the start node to the stack
        stack.push(start);
        while (!stack.isEmpty()) {
            //If Stack is not empty get the topmost value.
            int curr = stack.pop();
            if (!visited.contains(curr)) {
                //If it is not in the visited set, add it to the visited
                visited.add(curr);
                //Do whatever you want to do with the node
                System.out.print(curr + " ");
                for (int num : graph.getOrDefault(curr, new ArrayList<>())) {
                    //traverse all its children and add them to the stack for future visits if they are not already
                    //visited, that means not in the visited Set
                    if (!visited.contains(num)) {
                        stack.push(num);
                    }
                }
            }
        }
        System.out.println();
    }

    /**
     * Better because nodes are marked as visited as soon as they are encountered
     */
    private static void dfsOther(int start, Map<Integer, List<Integer>> graph) {
        //visited will contain all the visited nodes
        Set<Integer> visited = new HashSet<>();
        //stack will contain all the children of visited nodes
        Deque<Integer> stack = new LinkedList<>();
        //Push the start node to the stack
        stack.push(start);
        visited.add(start);
        while (!stack.isEmpty()) {
            //If Stack is not empty get the topmost value.
            int curr = stack.pop();
            //Do whatever you want to do with the node
            System.out.print(curr + " ");
            for (int num : graph.getOrDefault(curr, new ArrayList<>())) {
                //traverse all its children and add them to the stack for future visits if they are not already
                //visited, that means not in the visited Set
                if (!visited.contains(num)) {
                    stack.push(num);
                    visited.add(num);
                }
            }
        }
        System.out.println();
    }
    private static void dfsRecursive(int start, Map<Integer, List<Integer>> graph,  Set<Integer> visited ) {
        visited.add(start);
        System.out.print(start + " ");
        for (int child : graph.getOrDefault(start, new ArrayList<>())) {
           if(!visited.contains(child)){
               dfsRecursive(child, graph, visited);
           }
        }
    }
}
