package LeetCode.比特位计数;

/**
 * @author lingqu
 * @date 2022/4/3
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.countBits(5);
    }
}
class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        int highBit = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }
}
