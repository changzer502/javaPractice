package PAT.猜拳;

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

        int[][] arr = new int[n][n];
        boolean[][] isCmp = new boolean[n][n];
        int[] shou = new int[n];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a == 1) {
                // b,c对战中b胜
                if (!isCmp[b][c]) {
                    arr[b][c] = 1;
                    arr[c][b] = -1;
                    isCmp[b][c] = true;
                    isCmp[c][b] = true;
                    dfs(arr, isCmp, b, c);
                }
            } else {
                if (!isCmp[b][c]) {
                    System.out.println("Unknown");
                } else if (arr[b][c] == 0) {
                    System.out.println("Tie");
                } else if (arr[b][c] > 0) {
                    System.out.println("Win");
                } else {
                    System.out.println("Loss");
                }
            }
        }
    }

    private static void dfs(int[][] arr, boolean[][] isCmp, int b, int c) {
        for (int i = 0; i < arr[0].length; i++) {
            if (arr[b][i] < 0 && !isCmp[i][c]) {
                arr[i][c] = 0;
                arr[c][i] = 0;
                isCmp[i][c] = true;
                isCmp[c][i] = true;
                dfs(arr, isCmp, i, c);
            }
        }
    }
}
