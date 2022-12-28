package ACM.hdu1276士兵队列训练问题;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            List<Integer> list = new LinkedList<Integer>();
            for (int j = 1; j <= m; j++) {
                list.add(j);
            }
            int t = 2;
            while (list.size() > 3) {
                Iterator<Integer> iterator = list.iterator();
                int num = 1;
                while (iterator.hasNext()) {
                    iterator.next();
                    if (num % t == 0){
                        iterator.remove();
                    }

                    num++;
                }
                t = t==2? 3:2;
            }
            for (int j = 0; j < list.size(); j++) {
                if (j == list.size()-1) {
                    System.out.println(list.get(j));
                } else {
                    System.out.print(list.get(j) + " ");
                }
            }
        }
    }
}
