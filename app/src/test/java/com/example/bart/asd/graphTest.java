package com.example.bart.asd;

/**
 * Created by jberg on 6/5/2016.
 */

import org.junit.Test;

public class graphTest {
    @Test
    public static void main (String [] args) {
        Graph g = new Graph();
    try {
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex v5 = new Vertex("v5");
        Vertex v6 = new Vertex("v6");
        Vertex v7 = new Vertex("v7");


        g.addEdge("v1", "v2", 2);
        g.addEdge("v1", "v3", 4);
        g.addEdge("v1", "v4", 1);
        g.addEdge("v2", "v5", 10);
        g.addEdge("v2", "v4", 3);
        g.addEdge("v3", "v4", 2);
        g.addEdge("v3", "v6", 5);
        g.addEdge("v4", "v5", 7);
        g.addEdge("v4", "v6", 8);
        g.addEdge("v4", "v7", 4);
        g.addEdge("v5", "v7", 6);
        g.addEdge("v6", "v7", 1);

        g.dijkstra2("v1");
        g.printPath("v7");
    }
    catch(RuntimeException e) {
        System.out.print("error");
        }
    }
}
