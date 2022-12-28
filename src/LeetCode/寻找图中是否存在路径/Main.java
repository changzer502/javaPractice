package LeetCode.寻找图中是否存在路径;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author changzer
 * @date 2022/12/19
 * @apiNote
 */
public class Main {
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer>[] valid = new List[n];
        for (int i = 0; i < n; i++) {
            valid[i] = new ArrayList<>();
        }
        for (int[] p:edges) {
            valid[p[0]].add(p[1]);
            valid[p[1]].add(p[0]);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        visited[source] = true;
        queue.add(source);
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (poll == destination){
                break;
            }
            for (Integer p:valid[poll]){
                if (!visited[p]){
                    visited[p] = true;
                    queue.add(p);
                }
            }

        }
        return visited[destination];
    }
}
