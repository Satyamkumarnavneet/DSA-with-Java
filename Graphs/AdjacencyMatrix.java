package Graphs;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int adj[][] = new int [n+1][m+1];

        // edge 1 -- 2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;

//        adj[u][v] = 1;
//        adj[v][u] = 1;

    }
}
