package LeetCode.颜色交替的最短路径;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author changzer
 * @date 2023/2/2
 * @apiNote
 */
public class Main {
}
class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        List<Integer>[] redE = new List[n];
        List<Integer>[] blueE = new List[n];

        for(int i = 0; i < n; i++){
            redE[i] = new ArrayList<>();
            blueE[i] = new ArrayList<>();
        }

        for(int[] e:redEdges){
            redE[e[0]].add(e[1]);
        }
        for(int[] e:blueEdges){
            blueE[e[0]].add(e[1]);
        }
        int level = 0;
        Queue<int[]> queue = new ArrayDeque<>();// 由长度为 [2] 的数组表示每个点
        // 点的序号 + 下一次要走的 [颜色]
        queue.add(new int[]{0,0});
        queue.add(new int[]{0,1});

        int[] resR = new int[n];
        int[] resB = new int[n];
        for (int i = 1; i < n; i++){
            resR[i] = Integer.MAX_VALUE;
            resB[i] = Integer.MAX_VALUE;
        }
        while (!queue.isEmpty()){
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++){
                int[] poll = queue.poll();
                int cur = poll[0];
                int color = poll[1];
                if (color == 0){
                    for (int next:redE[cur]){
                        if (level < resR[next]){
                            resR[next] = level;
                            queue.add(new int[]{next,1});
                        }
                    }
                }else{
                    for (int next:blueE[cur]){
                        if (level < resB[next]){
                            resB[next] = level;
                            queue.add(new int[]{next,0});
                        }
                    }
                }
            }


        }
        for (int i=0;i<n;i++){
            if (resR[i] > resB[i]){
                resR[i] = resB[i];
            }else if(resR[i] == Integer.MAX_VALUE){
                resR[i] = -1;
            }
        }
        return resR;
    }
}
