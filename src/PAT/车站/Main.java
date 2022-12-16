package PAT.车站;

import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/11/12
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();

        int[][] arr = new int[n][3];
        int[][] arrVar = new int[n][3];
        arr[n-1][2] = m;
        arr[n-2][0] = m;

        arr[0][0] = a;
        arr[0][1] = a;
        arr[1][0] = a;

        arrVar[1][1] = 1;
        arrVar[1][2] = 1;
        for (int i = 2; i < n-1; i++){
            arrVar[i][1] = arrVar[i-1][1] + arrVar[i-2][1];
            arrVar[i][2] = arrVar[i-1][1];
            arrVar[i][0] = arrVar[i-1][0] + arrVar[i][1] - arrVar[i][2];


            arr[i][1] = arr[i-1][1] + arr[i-2][1];
            arr[i][2] = arr[i-1][1];
            arr[i][0] = arr[i-1][0] + arr[i][1] - arr[i][2];
        }
        int xx = (m-arr[n-2][0])/arrVar[n-2][0];

        System.out.println(xx*arrVar[x-1][0] + arr[x-1][0]);
    }
}
