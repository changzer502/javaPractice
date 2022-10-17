package PAT.数字分类;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = scan.nextInt();
        }
        int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = Integer.MIN_VALUE;
        boolean[] flag = new boolean[5];
        int index = 0;
        int nn = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 5 ==0 && nums[i] % 2 == 0){
                A1 += nums[i];
                flag[0] = true;
            }
            if(nums[i]%5==1){
                if(index % 2 == 0){
                    A2 += nums[i];
                }else{
                    A2 -= nums[i];
                }
                index++;
                flag[1] = true;
            }
            //被5除后余2的数字的个数
            if(nums[i]%5 == 2){
                A3++;
                flag[2] = true;
            }
            //被5除后余3的数字的平均数，精确到小数点后1位；
            if(nums[i] % 5 == 3){
                nn++;
                A4+=nums[i];
                flag[3] = true;
            }
            //被5除后余4的数字中最大数字。
            if(nums[i] % 5 == 4){
                flag[4] = true;
                if(A5 < nums[i]){
                    A5 = nums[i];
                }
            }
        }
        float a4 = (float)A4/nn;
        if (flag[0]){
            System.out.printf("%d ",A1);
        }else{
            System.out.print("N ");
        }if (flag[1]){
            System.out.printf("%d ",A2);
        }else{
            System.out.print("N ");
        }if (flag[2]){
            System.out.printf("%d ",A3);
        }else{
            System.out.print("N ");
        }if (flag[3]){
            System.out.printf("%.1f ",a4);
        }else{
            System.out.print("N ");
        }if (flag[4]){
            System.out.printf("%d",A5);
        }else{
            System.out.print("N");
        }

    }
}
