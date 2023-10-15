package com.swapnil;

import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraph;
import com.google.common.graph.ValueGraphBuilder;

public class SampleGraph {
    private static ValueGraph<String, Integer> createSampleGraph() {
        MutableValueGraph<String, Integer> graph = ValueGraphBuilder.undirected().build();
        graph.putEdgeValue("A", "C", 2);
        graph.putEdgeValue("A", "E", 3);
        graph.putEdgeValue("B", "E", 5);
        graph.putEdgeValue("B", "I", 15);
        graph.putEdgeValue("C", "D", 3);
        graph.putEdgeValue("C", "G", 2);
        graph.putEdgeValue("D", "E", 1);
        graph.putEdgeValue("D", "F", 4);
        graph.putEdgeValue("E", "F", 6);
        graph.putEdgeValue("F", "H", 7);
        graph.putEdgeValue("G", "H", 4);
        graph.putEdgeValue("H", "I", 3);

        return graph;

    }

    public static void main(String[] args) {
        ValueGraph<String, Integer> sampleGraph = createSampleGraph();
        System.out.println(sampleGraph);
    }
}
