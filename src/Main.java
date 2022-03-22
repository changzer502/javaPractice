import java.util.HashMap;
import java.util.Scanner;

/**
 * @author lingqu
 * @date 2021/11/28
 * @apiNote
 */
public class Main {
    //public static void main(String[] args) {
    //    //4 0 4 0 4 0 4 32 -1 -16 4 32 4 32 4 32 4 32 4 32 8 32 8 32 16 34 16 34 32 30 -64 0
    //    //int[] nums = new int[]{4, 0, 4, 0, 4, 0, 4, 32, -1, -16, 4, 32, 4, 32, 4, 32, 4, 32,4,32,8,32,8,32,16,34,16,34,32,30,-64,0};
    //    int[][] nums = new int[10][32];
    //    Scanner scanner = new Scanner(System.in);
    //    for(int j =0; j<10 ;j++){
    //        for(int i=0; i<32; i++){
    //            nums[j][i]=scanner.nextInt();
    //        }
    //    }
    //
    //    int count = 0;
    //
    //    for(int j = 0; j<10;j++){
    //        for(int i=0;i<32;i++){
    //            String s = "";
    //            int temp = nums[j][i]<0? -nums[j][i]:nums[j][i];
    //            while(temp!=0){
    //                int a = temp%2;
    //                temp /=2;
    //                s = String.valueOf(a) + s;
    //            }
    //            count++;
    //            if(nums[j][i] > 0){
    //                for(int l = 0; l<8-s.length(); l++){
    //                    System.out.print(" ");
    //                }
    //            }else{
    //                System.out.print("*");
    //                for(int l = 0; l<7-s.length(); l++){
    //                    System.out.print(" ");
    //                }
    //            }
    //            for(int k =0; k<s.length(); k++){
    //                if(s.charAt(k)=='1'){
    //                    System.out.print("*");
    //                }else{
    //                    System.out.print(" ");
    //                }
    //            }
    //            if(count%2==0){
    //                System.out.println("");
    //            }
    //        }
    //    }
    //
    //}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int k =scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = scan.nextInt();
        }
        quickSort(nums, 0, nums.length - 1);
        for(int num:nums){
            System.out.println(num);
        }
        long res = 1;
        long a =1000000009L;
        for (int i = 0; i < k; i++){
            res *= (nums[i]);
            res = res % a;
        }
        //res = res % ;

        System.out.println(res<0? -res :res);

        scan.close();
    }
    static void quickSort(int[] nums, int l, int r) {
        // 子数组长度为 1 时终止递归
        if (l >= r) return;
        // 哨兵划分操作
        int i = partition(nums, l, r);
        // 递归左（右）子数组执行哨兵划分
        quickSort(nums, l, i - 1);
        quickSort(nums, i + 1, r);
    }

    static int partition(int[] nums, int l, int r) {
        // 以 nums[l] 作为基准数
        int i = l, j = r;
        while (i < j) {
            while (i < j && (nums[j]>0? nums[j]:-nums[j]) <= (nums[l]>0? nums[l]:-nums[l])) j--;
            while (i < j && (nums[i]>0? nums[i]:-nums[i]) >= (nums[l]>0? nums[l]:-nums[l])) i++;
            swap(nums, i, j);
        }
        swap(nums, i, l);
        return i;
    }

    static void swap(int[] nums, int i, int j) {
        // 交换 nums[i] 和 nums[j]
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
