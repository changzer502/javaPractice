package LeetCode.转化时间需要的最少操作数;

/**
 * @author lingqu
 * @date 2022/4/3
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.convertTime("09:41", "10:34");
    }
}
class Solution {
    public int convertTime(String current, String correct) {
        String[] currentSplit = current.split(":");
        String[] correctSplit = correct.split(":");
        int h1 = Integer.parseInt(currentSplit[0]);
        int m1 = Integer.parseInt(currentSplit[1]);
        int h2 = Integer.parseInt(correctSplit[0]);
        int m2 = Integer.parseInt(correctSplit[1]);
        int res = 0;
        int rr1 = h1 * 60 + m1;
        int rr2 = h2 * 60 + m2;
        int i = rr2 - rr1;
        if (i / 60 != 0){
            res += i/60;
            i -= i/60 * 60;
        }
        if (i / 15 != 0){
            res += i/15;
            i -= i/15 * 15;
        }
        if (i / 5 != 0){
            res += i/5;
            i -= i/5 * 5;
        }
        return res += i;
    }
}
