package LeetCode.找出输掉零场或一场比赛的玩家;

import java.util.*;

/**
 * @author lingqu
 * @date 2022/4/3
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = new int[][]{{1,3},{2,3},{3,6},{5,6},
                {5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        s.findWinners(arr);
    }
}
class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> loseMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            int lose = matches[i][1];
            map.put(win, map.getOrDefault(win, 0) + 1);
            map.put(lose, map.getOrDefault(lose, 0) - 1);
            loseMap.put(lose, loseMap.getOrDefault(lose, 0) - 1);
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> wins = new ArrayList<>();
        List<Integer> loses = new ArrayList<>();
        for(Integer win : map.keySet()) {
            if (loseMap.getOrDefault(win,0) == 0){
                wins.add(win);
            }
        }
        for(Integer win : loseMap.keySet()) {
            if (loseMap.get(win) == -1){
                loses.add(win);
            }
        }
        Collections.sort(wins);
        Collections.sort(loses);
        res.add(wins);
        res.add(loses);
        return res;
    }
}
