package ACM.hdu4841圆桌问题;

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
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < 2*n; i++){
                list.add(i);
            }
            int pos = 0;
            for (int i = 0; i < n; i++){
                pos = (pos + m -1) % list.size();
                list.remove(pos);
            }
            int j = 0;
            for (int i = 0; i < 2*n; i++){
                if (i%50==0 && i!=0){
                    System.out.println();
                }
                if (j < list.size() && i ==list.get(j)){
                    j++;
                    System.out.print("G");
                }else{
                    System.out.print("B");
                }
            }
            System.out.println();
            System.out.println();
        }

    }
}
