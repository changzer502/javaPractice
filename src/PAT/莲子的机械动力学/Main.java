package PAT.莲子的机械动力学;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/11/26
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num1 = new int[n];
        int[] num2 = new int[m];

        for (int i = n - 1; i >= 0; i--) {
            num1[i] = scanner.nextInt();
        }
        for (int i = m - 1; i >= 0; i--) {
            num2[i] = scanner.nextInt();
        }
        int k = 0;
        List<Integer> res = new ArrayList<>();
        int i;
        for (i = 0; i < m && i < n; i++) {
            int tmp = num1[i] + num2[i] + k;
            k = tmp / (i + 2);
            res.add(tmp % (i + 2));
        }

        while (i < m) {
            int tmp = num2[i] + k;
            k = tmp / (i + 2);
            res.add(tmp % (i + 2));
            i++;
        }

        while (i < n) {
            int tmp = num1[i] + k;
            k = tmp / (i + 2);
            res.add(tmp % (i + 2));
            i++;
        }
        while(k!=0) {
            res.add(k%(i+2));
            k = k/(i+2);
            i++;
        }

        for (int j = res.size() - 1; j >= 0; j--) {
            if(j!=0){
                System.out.print(res.get(j) + " ");
            }else{
                System.out.print(res.get(j));
            }
        }
    }
}
