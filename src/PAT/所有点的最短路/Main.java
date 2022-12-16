package PAT.所有点的最短路;

import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/11/12
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();

        int[][] arr = new int[n][n];
        for (int i = 0; i < m; i++) {
            int ui = scanner.nextInt();
            int vi = scanner.nextInt();
            int wi = scanner.nextInt();

            arr[ui-1][vi-1] = wi;
        }
        //当点没有最短路时，用1061109567来代替。

        for (int i = 0; i < n; i++) {

        }

    }
}
