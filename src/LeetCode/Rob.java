package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2021/12/11
 * @apiNote
 */
public class Rob {
    private static int[] arr;
    private static int time;
    public static void main(String[] args) {
        arr = new int[]{5,3,3,3,5,6,2};
        time = 2;
        List<Integer> integers = goodDaysToRobBank(arr, time);

        for (Integer integer : integers) {
            System.out.println(integer );
        }
    }
    public static List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list = new ArrayList<>();
        for(int i = time ; i < security.length - time; i++){
            if(up(i) && low(i)){
                list.add(i);
            }
        }
        return list;
    }

    public static boolean up(int a){
        for(int i = a - time  ; i <= a && i+1 !=a; i++){

            if(arr[i] < arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean low(int a){
        for(int i = a+1; i <= time + a; i++){

            if(arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
