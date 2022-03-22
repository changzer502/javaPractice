package LeetCode;/**
 * @author lingqu
 * @date 2022/2/10
 * @apiNote
 */

import java.util.ArrayList;
import java.util.List;

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/2/10
 *@version 1.0
 */

class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<String>();
        for (int denominator = 2; denominator <= n; ++denominator) {
            for (int numerator = 1; numerator < denominator; ++numerator) {
                if (gcd(numerator, denominator) == 1) {
                    ans.add(numerator + "/" + denominator);
                }
            }
        }
        return ans;
    }
    public int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }
}
public class 最简分数 {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.simplifiedFractions(6);
    }
}
