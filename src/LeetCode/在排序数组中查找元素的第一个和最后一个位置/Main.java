package LeetCode.在排序数组中查找元素的第一个和最后一个位置;

/**
 * @author lingqu
 * @date 2022/4/3
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8).toString());
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int i = 0, j = nums.length-1;
        while(i < j) {
            int mid = i + (j-i)/2;
            if(nums[mid] > target){
                j = mid - 1;
            }else if(nums[mid] < target){
                i = mid + 1;
            }else{
                while(nums[i] != target && i > 0){
                    if(nums[i] == target) {
                        i--;
                    }
                }
                while(nums[j] != target){
                    if(nums[j] == target) {
                        j++;
                    }
                }
                res[0] = i + 1;
                res[1] = j - 1;
                break;
            }
        }
        return res;
    }
}
