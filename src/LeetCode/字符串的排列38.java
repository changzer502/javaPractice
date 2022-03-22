package LeetCode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lingqu
 * @date 2021/11/18
 * @apiNote
 */
public class 字符串的排列38 {

    static List<String> res = new LinkedList<>();
    static char[] c;
    public static String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }
    static void dfs(int x) {
        if(x == c.length - 1) {
            res.add(String.valueOf(c));      // 添加排列方案
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++) {
            if(set.contains(c[i])) continue; // 重复，因此剪枝
            set.add(c[i]);
            swap(i, x);                      // 交换，将 c[i] 固定在第 x 位
            dfs(x + 1);                      // 开启固定第 x + 1 位字符
            swap(i, x);                      // 恢复交换
        }
    }
    static void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

    public static void main(String[] args) {
        String s = "abc";
        String[] permutation = permutation(s);
        for (int i = 0; i < permutation.length; i++){
            System.out.println(permutation[i]);
        }
    }
}
