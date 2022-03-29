package LeetCode.考试的最大困扰度;

/**
 * @author lingqu
 * @date 2022/3/29
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.maxConsecutiveAnswers("TTFTTFTT",1);
    }
}
class Solution {
    String s;
    int n, k;
    public int maxConsecutiveAnswers(String answerKey, int _k) {
        s = answerKey;
        n = s.length(); k = _k;
        return Math.max(getCnt('T'), getCnt('F'));
    }
    int getCnt(char c) {
        int ans = 0;
        for (int i = 0, j = 0, cnt = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                cnt++;
            }
            while (cnt > k) {
                if (s.charAt(j) == c) {
                    cnt--;
                }
                j++;
            }
            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}
