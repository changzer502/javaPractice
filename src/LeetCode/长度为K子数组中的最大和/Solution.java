package LeetCode.长度为K子数组中的最大和;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long res = Long.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        long sum = 0;
        for(int i = 0; i < k; i++){
            int x = nums[i];
            map.put(x,map.getOrDefault(x,0)+1);
            sum+=x;
        }
        if(map.size() == k){
            res = res > sum? res:sum;
        }
        for(int i = k; i < nums.length; i++){
            sum -= nums[i-k];
            //map.remove(nums[i-k]);
            map.put(nums[i-k],map.get(nums[i-k])-1);

            int x = nums[i];
            sum+=x;
            boolean flag = true;
            for(Map.Entry<Integer,Integer> e:map.entrySet()){
                if (e.getValue() > 1) {
                    flag = false;
                    break;
                }
            }
            if(flag && (!map.containsKey(x) || map.get(x) == 0)){

                res = res > sum? res:sum;
            }
            map.put(x,map.getOrDefault(x,0)+1);
        }
        return res==Long.MIN_VALUE? 0:res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maximumSubarraySum(new int[]{1,1,1,1,1,1}, 2));
    }
}
