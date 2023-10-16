package com.swapnil.graph;

import java.util.List;
        import java.util.ArrayList;

public class AdjacencyList {

    int nodes;
    List<List<Integer>> adjlist;

    AdjacencyList (int arg_nodes) {
        nodes = arg_nodes;
        adjlist = new ArrayList<>(nodes);
        for (int i=0; i<nodes; i++)
            adjlist.add(new ArrayList<>());
    }

    void addEdge(int src, int dst) {
        adjlist.get(src).add(dst);
        adjlist.get(dst).add(src);
    }

    void iterate(int src) {
        System.out.print("\n" + src + " : ");
        for(Integer adj_node : adjlist.get(src)) {
            System.out.print(adj_node + " ");
        }
    }

    public static void main (String[] args) {

        AdjacencyList g = new AdjacencyList(7);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,5);
        g.addEdge(4,6);
        g.addEdge(5,6);

        System.out.print("Adjacency list implementation for graph");

        g.iterate (0);
        g.iterate (1);
        g.iterate (4);
    }
}