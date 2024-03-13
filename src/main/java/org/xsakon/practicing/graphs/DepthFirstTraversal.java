package org.xsakon.practicing.graphs;

import java.util.*;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', List.of('b', 'c'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', List.of());
        graph.put('f', List.of());

        depthFirstPrintIterative(graph, 'a');
        System.out.println();
        depthFirstPrintRecursive(graph, 'a');
    }

    public static void depthFirstPrintIterative(Map<Character, List<Character>> graph, Character source) {
        Stack<Character> stack = new Stack<>();
        stack.add(source);

        while (!stack.empty()) {
            Character current = stack.pop();
            System.out.print(current);

            for (Character neighbor : graph.get(current)) {
                stack.push(neighbor);
            }
        }
    }

    public static void depthFirstPrintRecursive(Map<Character, List<Character>> graph, Character source) {
        System.out.print(source);
        for (Character neighbor : graph.get(source)) {
            depthFirstPrintRecursive(graph, neighbor);
        }
    }


}

