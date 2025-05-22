import java.util.*;
class Solution {
  public int solution(int[] info, int[][] edges) {
        List<Integer>[] graph = new ArrayList[info.length];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int parent = edge[0];
            int child = edge[1];
            graph[parent].add(child);
        }

        int[] maxSheep = {0};
        List<Integer> nextNodes = new ArrayList<>();
        nextNodes.add(0);

        dfs(0, 0, 0, nextNodes, info, graph, maxSheep);

        return maxSheep[0];
    }

    private void dfs(int current, int sheep, int wolf, List<Integer> nextNodes,
                     int[] info, List<Integer>[] graph, int[] maxSheep) {
        if (info[current] == 0) sheep++;
        else wolf++;

        if (wolf >= sheep) return;

        maxSheep[0] = Math.max(maxSheep[0], sheep);

        List<Integer> newNextNodes = new ArrayList<>(nextNodes);
        newNextNodes.remove(Integer.valueOf(current));
        newNextNodes.addAll(graph[current]);

        for (int next : newNextNodes) {
            dfs(next, sheep, wolf, newNextNodes, info, graph, maxSheep);
        }
    }
}
