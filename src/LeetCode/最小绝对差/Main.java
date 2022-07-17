package LeetCode.最小绝对差;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/7/4
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {4,2,1,3};
        s.minimumAbsDifference(arr);
    }
}

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int[] c = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i < arr.length; i++) {
            c[i-1] = arr[i] - arr[i-1];
            if(min > c[i-1]) {
                min = c[i-1];
            }
        }
        for(int i = 0; i < c.length; i++){
            if(c[i] == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                res.add(list);
            }
        }
        return res;
    }
}
