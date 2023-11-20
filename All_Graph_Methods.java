// There are 4 of making graph
        // 1. Adjacency List(one of the most optimized)
        // 2.

import java.util.ArrayList;

class Edge{ // this edge for undirected and unweighted graph
    int src; // source
    int dest; // destination
    Edge(int s,int d){
        this.src=s;
        this.dest=d;
    }
}

class Main{

    static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){ // converting null to empty array list
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

        // advantage of Adjacency List
            // 1. No extra space
            // 2. hence optimized time
    }
    public static void main(String[] args) {
        int V=4; // vertices
        ArrayList<Edge>[] graph=new ArrayList[V];
        createGraph(graph);

        // now printing 2's neighbour
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }
}


class All_Graph_Methods{
    public static void main(String[] args) {
        
    }
}