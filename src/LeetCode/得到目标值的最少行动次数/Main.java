package LeetCode.得到目标值的最少行动次数;

/**
 * @author lingqu
 * @date 2022/1/16
 * @apiNote
 */

class Solution {
    public int minMoves(int target, int maxDoubles) {
        int res = 0;
        while(target!=1){
            if(maxDoubles == 0){
                res += target-1;
                break;
            }
            else if(target%2==1) {
                target--;
                res++;
            }else{
                target = target/2;
                maxDoubles--;
                res++;
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minMoves(5, 0));
    }
}
