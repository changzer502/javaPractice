package LeetCode.两个列表的最小索引总和;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lingqu
 * @date 2022/3/14
 * @apiNote
 */

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        List<String> list  = new ArrayList<>();
        int sum = Integer.MAX_VALUE;
        for(int i = 0; i<list2.length; i++){
            if(map.containsKey(list2[i])){
                if(sum > map.get(list2[i]) + i){
                    list = new ArrayList<>();
                    list.add(list2[i]);
                    sum = map.get(list2[i]) + i;
                }else if(sum == map.get(list2[i]) + i){
                    list.add(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] restaurant = s.findRestaurant(list1, list2);
        System.out.println(restaurant);
    }
}
