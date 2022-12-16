package PAT.A除以B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int b = sc.nextInt();
        char[] a = str.toCharArray();
        int Q, R, i;
        Q = (a[0] - '0') / b;
        R = (a[0] - '0') % b;

        if (Q != 0) {
            System.out.printf("%d", Q);
        }                           //不输出首位小于除数的（为0），并且排除个位数

        for (i = 1; i < a.length; i++) {
            Q = ((a[i] - '0') + 10 * R) / b;
            R = ((a[i] - '0') + 10 * R) % b;
            System.out.printf("%d", Q);
        }
        System.out.printf(" %d", R);

    }
}
