package LeetCode.单调递增的数字;

/**
 * @author lingqu
 * @date 2022/9/14
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.monotoneIncreasingDigits(101));
    }
}
class Solution {
    public int monotoneIncreasingDigits(int n) {
        int res = 0;
        int jin = 1;
        while(n>0){
            int last = n%10;
            n /= 10;
            if(last > n%10 && (n==0 || n%10 != 0)){
                res = res+last*jin;
            }else if(n!=0){
                res = res+9*jin;
                n--;
            }
            jin*=10;
        }
        return res;
    }
}
