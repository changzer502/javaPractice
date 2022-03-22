package LeetCode.格雷编码;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/1/8
 * @apiNote
 */
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<Integer>();
        List<StringBuffer> gray = new ArrayList<>();
        StringBuffer first = new StringBuffer();
        StringBuffer second = new StringBuffer();
        first.append("0");
        second.append("1");
        gray.add(first);
        gray.add(second);
        for(int i = 1; i < n; i++){
            int size = gray.size();
            for(int j=size-1;j>=0;j--){
                gray.add(new StringBuffer(gray.get(j).toString()));
            }
            size = gray.size();
            int mid = size/2;
            for(int j = 0; j < size; j++){
                if(j<mid){
                    gray.get(j).insert(0,"0");
                }else{
                    gray.get(j).insert(0,"1");
                }
            }
        }
        for(StringBuffer s: gray){
            res.add(Integer.valueOf(s.toString(),2));
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        for(Integer i: s.grayCode(3)){
            System.out.println(i);
        }
    }
}
