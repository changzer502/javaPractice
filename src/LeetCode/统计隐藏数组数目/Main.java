package LeetCode.统计隐藏数组数目;/**
 * @author lingqu
 * @date 2022/1/22
 * @apiNote
 */

/**
 *@description TODO
 *@author zzhi
 *@createDate 2022/1/22
 *@version 1.0
 */
class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int[] cc=new int[differences.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxI = 0;
        int minI = 0;
        int value=0;
        for(int i = 0; i < differences.length; i++) {

            value+=differences[i];
            cc[i] = value;
            if(value >max)
            {
                max = value;
                maxI = i;
            }
            if(value < min){
                min = value;
                minI = i;
            }
        }
        int maxV = upper - cc[maxI];
        if(maxV > upper){
            maxV = upper;
        }
        int minV = lower - cc[minI];
        if(minV < lower){
            minV = lower;
        }
        return maxV-minV +1 >0? maxV-minV +1: 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] d = {4,-7,2};
        System.out.println(s.numberOfArrays(d, 3, 6));
    }
}
