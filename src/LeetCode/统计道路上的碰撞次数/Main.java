package LeetCode.统计道路上的碰撞次数;

/**
 * @author lingqu
 * @date 2022/3/20
 * @apiNote
 */
class Solution {
    public int countCollisions(String directions) {
        int res = 0;
        char[] chars = directions.toCharArray();
        int n = chars.length;
        int lian = 0;
        for(int i = 0; i < n; i++){
            if (i > 0 && chars[i] != 'S' && chars[i-1] == chars[i] ){
                lian++;
            }else{
                lian = 0;
            }
            if(i > 0 && chars[i-1] == 'R' && chars[i] == 'L'){
                chars[i-1] = 'S';
                chars[i] = 'S';
                res += 2 + lian;
            }
            if(i < n-1 && chars[i+1] == 'L' && chars[i] == 'R'){
                chars[i+1] = 'S';
                chars[i] = 'S';
                res += 2 + lian;
            }
            if (i > 0 && chars[i-1] == 'S' && chars[i] == 'L'){
                chars[i] = 'S';
                res += 1+ lian;
            }
            if(i < n-1 && chars[i+1] == 'S' && chars[i] == 'R'){
                chars[i] = 'S';
                res += 1+ lian;
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.countCollisions("SSRSSRLLRSLLRSRSSRLRRRRLLRRLSSRR");
    }
}
