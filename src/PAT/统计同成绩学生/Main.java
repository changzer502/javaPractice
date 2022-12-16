package PAT.统计同成绩学生;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/12/16
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int k = scanner.nextInt();
            map.put(k, map.getOrDefault(k,0)+1);
        }
        int s = scanner.nextInt();
        for(int i = 0; i < s; i++){
            if (i==0){
                System.out.print(map.getOrDefault(scanner.nextInt(),0));
            }else{
                System.out.print(" "+map.getOrDefault(scanner.nextInt(),0));
            }
        }
    }
}
