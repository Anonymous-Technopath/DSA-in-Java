/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : BFS in Graph
*Problem Source : Coding Ninjas
* 
*/


import java.util.*;
public class BFS_In_Graph{
    private static Map<Integer, List<Integer>> adjList = new HashMap<>();
    private static Map<Integer, Boolean> visited = new HashMap<>();
    private static List<Integer> ans = new ArrayList<>();
    private static Queue<Integer> bfsQ = new LinkedList<>();
    public static void addEdge(int s, int d) {
        adjList.computeIfAbsent(s, k -> new ArrayList<>()).add(d);
    }
    public static void createAdjList(List<List<Integer>> adj) {
        for(int i=0;i<adj.size();i++) {
            if(!adj.get(i).isEmpty())
                for(int num:adj.get(i)) {
                    addEdge(i, num);
                }
        }
    }
    public static void traverse(int startNode) {
        bfsQ.add(startNode);
        visited.put(startNode, true);
        while(!bfsQ.isEmpty()) {
            int qEle = bfsQ.poll();
            ans.add(qEle);
            for(Integer adjEle:adjList.getOrDefault(qEle, new ArrayList<>())) {
                if(!visited.containsKey(adjEle)) {
                    bfsQ.add(adjEle);
                    visited.put(adjEle, true);
                }
            }
        }
    }
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj){
        // Write your code here
        createAdjList(adj);
        traverse(0);
        return ans;
    }
}
