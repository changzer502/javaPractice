package PAT.PERKET;

import java.util.Scanner;

/**
 * @author changzer
 * @date 2023/2/25
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] dp = new int[n][3];
        dp[0][0] = scanner.nextInt();
        dp[0][1] = scanner.nextInt();
        dp[0][2] = Math.abs(dp[0][1]-dp[0][0]);
        for (int i = 1; i < n; i++){
            int si = scanner.nextInt();
            int bi = scanner.nextInt();

            int minSi =  dp[i-1][0];
            int minBi =  dp[i-1][1];
            int minMath =  dp[i-1][2];
            for (int j = 0; j<i;j++){
                int ssi = dp[j][0]*si;
                int bbi = dp[j][1]+bi;
                if (dp[j][2] < minMath){
                    minSi =  dp[j][0];
                    minBi =  dp[j][1];
                    minMath =  dp[j][2];
                }
                if (Math.abs(ssi-bbi) < minMath){
                    minSi = ssi;
                    minBi = bbi;
                    minMath = Math.abs(ssi-bbi);
                }
            }
            dp[i][0] = minSi;
            dp[i][1] = minBi;
            dp[i][2] = minMath;
        }
        System.out.println(dp[n-1][2]);
    }
}
