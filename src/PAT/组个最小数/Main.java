package PAT.组个最小数;

import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/11/14
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < 10; i++){
            if (arr[i] != 0) {
                System.out.print(i);
                arr[i]--;
                break;
            }
        }
        while (arr[0] != 0){
            System.out.print(0);
            arr[0]--;
        }
        for (int i = 1; i < 10; i++){
            while (arr[i] != 0){
                System.out.print(i);
                arr[i]--;
            }
        }
    }
}
