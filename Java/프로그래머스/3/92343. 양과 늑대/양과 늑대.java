import java.util.*;

class Solution {
    public int solution(int[] info, int[][] edges) {
        List<Integer>[] graph = new ArrayList[info.length];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        int maxSheep = 0;
        Stack<Object[]> stack = new Stack<>();
        stack.push(new Object[]{0, 0, 0, List.of(0)});

        while (!stack.isEmpty()) {
            Object[] curr = stack.pop();
            int node = (int) curr[0];
            int sheep = (int) curr[1];
            int wolf = (int) curr[2];
            List<Integer> candidates = (List<Integer>) curr[3];

            if (info[node] == 0) sheep++;
            else wolf++;

            if (wolf >= sheep) continue;

            maxSheep = Math.max(maxSheep, sheep);

            List<Integer> nextCandidates = new ArrayList<>(candidates);
            nextCandidates.remove(Integer.valueOf(node));
            nextCandidates.addAll(graph[node]);

            for (int next : nextCandidates) {
                stack.push(new Object[]{next, sheep, wolf, new ArrayList<>(nextCandidates)});
            }
        }

        return maxSheep;
    }
}  