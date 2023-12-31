package graph_1;
/*isConnected?
Send Feedback
Given an undirected graph G(V,E), check if the graph G is connected graph or not.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
Output Format :
The first and only line of output contains "true" if the given graph is connected or "false", otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
true
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
false 
Sample Output 2 Explanation
The graph is not connected, even though vertices 0,1 and 3 are connected to each other but there isn’t any path from vertices 0,1,3 to vertex 2. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class isConnected_8 {

	    public static boolean isConnectedGraph(int V, List<List<Integer>> adjList) {
	        if (adjList.isEmpty()) {
	            return V == 0; // Graph with no edges is connected if it has only one vertex
	        }

	        boolean[] visited = new boolean[V];
	        dfs(0, adjList, visited);
	        
	        for (boolean v : visited) {
	            if (!v) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
	    
	    public static void dfs(int vertex, List<List<Integer>> adjList, boolean[] visited) {
	        visited[vertex] = true;
	        
	        for (int neighbor : adjList.get(vertex)) {
	            if (!visited[neighbor]) {
	                dfs(neighbor, adjList, visited);
	            }
	        }
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String[] ve = br.readLine().trim().split(" ");
	        int V = Integer.parseInt(ve[0]);
	        int E = Integer.parseInt(ve[1]);

	        // Create an adjacency list to represent the graph
	        List<List<Integer>> adjList = new ArrayList<>();
	        for (int i = 0; i < V; i++) {
	            adjList.add(new ArrayList<>());
	        }

	        for (int i = 0; i < E; i++) {
	            String[] uv = br.readLine().trim().split(" ");
	            int u = Integer.parseInt(uv[0]);
	            int v = Integer.parseInt(uv[1]);
	            adjList.get(u).add(v);
	            adjList.get(v).add(u); // Since it is an undirected graph
	        }

	        boolean isConnected = isConnectedGraph(V, adjList);
	        System.out.println(isConnected ? "true" : "false");
	    }
	}

