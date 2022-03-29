package LeetCode.棒球比赛;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/3/26
 * @apiNote
 */
class Solution {
    public int calPoints(String[] ops) {
        List<Integer> points = new ArrayList<Integer>();
        String temp = "1234567890";
        int res = 0;
        for (String op : ops) {
            int n = points.size();
            switch (op) {
                case "+":
                    res += points.get(n-1) + points.get(n-2);
                    points.add(points.get(n-1) + points.get(n-2));
                    break;
                case "D":
                    res += points.get(n-1) * 2;
                    points.add(points.get(n-1) * 2);
                    break;
                case "C":
                    res -= points.get(n-1);
                    points.remove(n-1);
                    break;
                default:
                    int i = Integer.parseInt(op);
                    res += i;
                    points.add(i);
            }
        }
        return res;
    }
}
public class Main {
}
