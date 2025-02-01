package abhi.practice.graphs;

import java.util.*;

public class BreadthFirstSearch {

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


        System.out.println("BFS Traversal: ");
        bfs(0, graph);
        bfsOther(0, graph);
        bfsRecur(0, graph);
        System.out.println();

        System.out.println("BFS Traversal: ");
        bfs(2, graph);
        bfsOther(2, graph);
        bfsRecur(2, graph);
    }

    private static void bfs(int start, Map<Integer, List<Integer>> graph) {
        //A queue to store all the children of already visited node
        Queue<Integer> queue = new LinkedList<>();
        //A set to store already visited nodes
        Set<Integer> visited = new HashSet<>();
        //Add the start node to the queue
        queue.offer(start);
        //add the start node to the visited node
        visited.add(start);
        while (!queue.isEmpty()) {
            //Get the first node from the queue out.
            int current = queue.poll();
            //Do what ever you want to do with it.
            System.out.print(current + " ");
            for (int child : graph.getOrDefault(current, new ArrayList<>())) {
                //Get the children or the current node
                if (!visited.contains(child)) {
                    //If they are not visited, add them to the queue
                    queue.offer(child);
                    //Mark them visited.
                    visited.add(child);
                }
            }
        }
        System.out.println();
    }

    private static void bfsOther(int start, Map<Integer, List<Integer>> graph) {
        //A queue to store all the children of already visited node
        Queue<Integer> queue = new LinkedList<>();
        //A set to store already visited nodes
        Set<Integer> visited = new HashSet<>();
        //Add the start node to the queue
        queue.offer(start);
        while (!queue.isEmpty()) {
            //Get the first node from the queue out.
            int current = queue.poll();
            if (!visited.contains(current)) {
                //If the current node is not visited earlier, mark them visited
                visited.add(current);
                //Do whatever you want to do with them
                System.out.print(current + " ");
                for (int child : graph.getOrDefault(current, new ArrayList<>())) {
                    //Get the children or the current node
                    if (!visited.contains(child)) {
                        //If they are not visited, add them to the queue
                        queue.offer(child);
                    }
                }
            }
        }
        System.out.println();
    }

    private static void bfsRecur(int start, Map<Integer, List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(start);
        bfsRecursion(queue, graph, visited);
    }


    private static void bfsRecursion(Queue<Integer> queue, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (queue.isEmpty()) {
            return;
        }
        int curr = queue.poll();
        System.out.print(curr + " ");
        visited.add(curr);
        for (int child : graph.getOrDefault(curr, new ArrayList<>())) {
            if(!visited.contains(child)) {
                queue.offer(child);
            }
        }
        bfsRecursion(queue, graph, visited);
    }
}
