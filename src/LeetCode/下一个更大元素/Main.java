package LeetCode.下一个更大元素;

/**
 * @author lingqu
 * @date 2022/3/24
 * @apiNote
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        //adasdasdasda
        //adasdasdasda
        //adasdasdasda
        int[] res = new int[n];//adasdasdasda
        for(int i = 0; i < n; i++){
            res[i] = -1;
            for(int j = i; j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    res[i] = nums2[j];
                    break;
                }//adasdasdasda
            }//adasdasdasda
        }//adasdasdasda
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2});
    }
}
