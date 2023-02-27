package PAT.狂飙;

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
        if (n <= 2){
            System.out.println(0);
            return;
        }
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }
        int dp[][] = new int[n][3];
        dp[0][0]=nums[0];
        dp[0][1]=0;
        dp[0][2]=0;
        dp[1][0]= Math.min(dp[0][0], dp[0][1])+nums[1];
        dp[1][1]=dp[0][0];
        dp[1][2]=0;
        for (int i = 2; i < n; i++){
            int num = nums[i];
            dp[i][0]=Math.min(dp[i-1][1],Math.min(dp[i-1][2],dp[i-1][0]))+num;
            dp[i][1]=dp[i-1][0];
            dp[i][2]=dp[i-2][0];
        }
        System.out.println(Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2])));
    }
}
