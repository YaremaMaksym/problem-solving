package org.xsakon.practicing.graphs;

import java.util.*;

public class BreadthFirstTraversal {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', List.of('b', 'c'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', List.of());
        graph.put('f', List.of());

        breadthFirstPrintIterative(graph, 'a');
        // Only Iterative

    }

    public static void breadthFirstPrintIterative(Map<Character, List<Character>> graph, Character source) {
        Queue<Character> queue = new PriorityQueue<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            Character current = queue.poll();
            System.out.print(current);

            for (Character neighbor : graph.get(current)) {
                queue.add(neighbor);
            }
        }
    }
}
