package org.xsakon.practicing.dp.graphs;

import java.util.*;

public class HasPath {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', List.of('b', 'c'));
        graph.put('b', List.of('c'));
        graph.put('c', List.of('e'));
        graph.put('e', List.of());

        System.out.println(hasPathBfs(graph, 'b', 'a'));
        System.out.println(hasPathBfs(graph, 'a', 'c'));
    }

    static public boolean hasPathDfs(Map<Character, List<Character>> graph, Character src, Character dst) {
        if (src == dst) return true;

        for (Character neighbor : graph.get(src)) {
            if (hasPathDfs(graph, neighbor, dst)) return true;
        }

        return false;
    }

    static public boolean hasPathBfs(Map<Character, List<Character>> graph, Character src, Character dst) {
        Queue<Character> queue = new PriorityQueue<>();
        queue.add(src);

        while (!queue.isEmpty()) {
            Character current = queue.poll();
            if (current == dst) return true;

            for (Character neighbor : graph.get(current)) {
                queue.add(neighbor);
            }
        }

        return false;
    }
}

