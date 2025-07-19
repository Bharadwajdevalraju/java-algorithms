package org.bd.blind50.set3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph {

    private static Map<Graph, Graph> visited = new HashMap<>();

    public static Graph solve(Graph original) {
        if(original == null) return  null;
        if(visited.containsKey(original)) {
            return visited.get(original);
        }
        Graph graph = new Graph();
        graph.value = original.value;
        visited.put(original, graph);
        List<Graph> n = new ArrayList<>();
        graph.neighbors = n;
        for(int i=0;i<original.neighbors.size();i++) {
            n.add(solve(original.neighbors.get(i)));
        }
        return graph;
    }
}

class Graph {
    public int value;
    public List<Graph> neighbors;
 }
