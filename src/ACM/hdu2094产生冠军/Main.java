package ACM.hdu2094产生冠军;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author changzer
 * @date 2022/12/26
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> all;
        Set<String> lose;
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n == 0){
                break;
            }
            all = new HashSet<>();
            lose = new HashSet<>();
            for (int i = 0; i < n; i++){
                String a = scanner.next();
                String b = scanner.next();
                all.add(a);
                all.add(b);
                lose.add(b);
            }
            if (all.size()-lose.size() == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
