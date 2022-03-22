package LeetCode.句子中的最多单词数;

import java.util.*;

/**
 * @author lingqu
 * @date 2021/12/25
 * @apiNote
 */
class Solution {
    public long[] getDistances(int[] arr) {
        long[] res=new long[arr.length];
        HashMap<Integer,List<Integer>> list=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(list.containsKey(arr[i])){
                List<Integer> tmpList=list.get(arr[i]);
                tmpList.add(i);
                list.put(arr[i],tmpList);
            }else{
                List<Integer> tmp = new LinkedList<>();
                tmp.add(i);
                list.put(arr[i],tmp);
            }
        }
        String text="awed ";

        for(int i=0;i<arr.length;i++){
            int tmp=0;
            for(int j=0;j<arr.length;j++){
                if(j==i) continue;
                if(arr[i]==arr[j]){
                    tmp+= Math.abs(i-j);
                }
            }
            res[i]=tmp;
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] ss={2,1,3,1,2,3,3};
        long[] distances = s.getDistances(ss);

    }
}
