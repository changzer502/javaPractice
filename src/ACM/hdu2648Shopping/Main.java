package ACM.hdu2648Shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/12/26
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String,Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String next = scanner.next();
            map.put(next, 0L);
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++){
                int p = scanner.nextInt();
                String next = scanner.next();
                map.put(next,map.get(next)+p);
            }
            long res = 1;
            long memory = map.get("memory");
            for (Map.Entry<String,Long> entry : map.entrySet()){
                if (entry.getValue() > memory){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
