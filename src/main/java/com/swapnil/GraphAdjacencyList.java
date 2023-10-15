package com.swapnil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphAdjacencyList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> adjacencyMap = new HashMap<>();
        for (int[] edge : edges) {
            List<Integer> list = adjacencyMap.getOrDefault(edge[0], new ArrayList<>());
            list.add(edge[1]);
            adjacencyMap.put(edge[0], list);
            List<Integer> list2 = adjacencyMap.getOrDefault(edge[1], new ArrayList<>());
            list2.add(edge[0]);
            adjacencyMap.put(edge[1], list2);
        }
        for (int i = 0; i < V; i++) {
            if (adjacencyMap.get(i) != null) {
                result.add(adjacencyMap.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] edges = //{{0,1},{0,4},{4,1},{4,3},{1,3},{1,2},{3,2}};
//                {
//                        {3, 7},
//                        {4, 7},
//                        {5, 7},
//                        {1, 8},
//                        {6, 2},
//                        {0, 6}};
                {{4 ,5},
        {1 ,6},
        {11, 6},
        {8 ,6},
        {10, 5},
        {2 ,5}};
        //print adjacency list
        GraphAdjacencyList adjacencyList = new GraphAdjacencyList();
        System.out.println(adjacencyList.printGraph(12, edges));

    }
}
