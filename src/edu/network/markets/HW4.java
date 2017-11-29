package edu.network.markets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class HW4{

    public static class DirectedGraph {

        int numberOfNodes = 0;
        Map<Integer, List<Integer>> edges = new HashMap<>();


        DirectedGraph(int numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            //throw new RuntimeException("Implement me!");
        }

        void addEdge(int node, int newNeighbor) {
            /*for (Map.Entry<Integer, List<Integer>> entry : edges.entrySet()) {
                System.out.println(entry.getValue());
            }*/
            System.out.println("Add new neighbor: " + newNeighbor + " to node: " + node);
            List<Integer> neighbors = edges.getOrDefault(node, new ArrayList<Integer>());
            neighbors.add(newNeighbor);
            edges.put(node, neighbors);
        }

        // This method should return true is there is an edge between origin and destination
        boolean checkEdge(int origin, int destination) {
            List neighbors = edges.getOrDefault(origin, new ArrayList<Integer>());
            return (neighbors.contains(destination))? true : false;
        }

        // This method should return a list of all the nodes u such that the edge (origin_node,u) is
        // part of the graph.
        List<Integer> edgesFrom(int origin) {
            List neighbors = edges.getOrDefault(origin, new ArrayList<Integer>());
            return neighbors;
        }

        // This method should return the number of nodes in the graph
        int numberOfNodes() {
            return this.numberOfNodes;
        }
    }


    //	This method, given a directed graph, should run the epsilon-scaled page-rank
    //	algorithm for num-iter iterations and return an array where position i contains the weight of the corresponsing node.
    //	In the case of 0 iterations, all nodes should have weight 1/number_of_nodes
    public static double[] scaledPageRank(DirectedGraph g, int num_iter, double eps){
        throw new RuntimeException("Implement me!");
    }

    // This method, should construct and return a DirectedGraph encoding the left example in fig 15.1
    // Use the following indexes: A:0, B:1, C:2, Z:3
    public static DirectedGraph graph15_1Left(){
        throw new RuntimeException("Implement me!");
    }

    // This method, should construct and return a DirectedGraph encoding the right example in fig 15.1
    // Use the following indexes: A:0, B:1, C:2, Z1:3, Z2:4
    public static DirectedGraph graph15_1Right(){
        throw new RuntimeException("Implement me!");
    }


    // This method, should construct and return a DirectedGraph encoding example 15.2
    // Use the following indexes: A:0, B:1, C:2, A':3, B':4, C':5
    public static DirectedGraph graph15_2(){
        throw new RuntimeException("Implement me!");
    }

    // This method, should construct and return a DirectedGraph of your choice with at least 10 nodes
    public static DirectedGraph extraGraph1(){
        throw new RuntimeException("Implement me!");
    }

    // This array should contains the expected weights of each node when running the scaled page rank on the extraGraph1 output
    // with epsilon = 0.07 and num_iter = 20.
    public static double[] extraGraph1Weights = {1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};


    // This method, should construct and return a DirectedGraph of your choice with at least 10 nodes
    public static DirectedGraph extraGraph2(){
        throw new RuntimeException("Implement me!");
    }

    // This array should contains the expected weights of each node when running the scaled page rank on the extraGraph2 output
    // with epsilon = 0.07 and num_iter = 20.
    public static double[] extraGraph2Weights = {1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0,1.0};


    // This method should return a DIRECTED version of the facebook graph as an instance of the DirectedGraph class.
    // In particular, if u and v are friends, there should be an edge between u and v and an edge between v and u.
    public static DirectedGraph facebookGraph(String filename){
        throw new RuntimeException("Implement me!");
    }


    // All the code necessary for measurements for question 8b should go in the main function.
    public static void main(String[] args) throws Throwable {
        //System.out.println("Implement me!");
        DirectedGraph graph151_1 = new DirectedGraph(4);
        graph151_1.addEdge(0, 1);
        graph151_1.addEdge(1, 2);
        graph151_1.addEdge(2, 0);
        graph151_1.addEdge(0, 4);
        graph151_1.addEdge(4, 4);

        //System.out.println(graph151_1.numberOfNodes);

        for (int neighbor: graph151_1.edgesFrom(0)) {
            System.out.println(neighbor);
        }

        //return;
    }
}

