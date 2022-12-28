package test.challenge.t4;

import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/12/18
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long tmp = 0;
        long res = 0;
        int i = 0;
        if (n%2==1){
            tmp = n;
            res = n;
            i = 2;
            System.out.print(tmp);
        }

        for (; i < n; i+=2) {
            tmp = tmp * 100 + n*10 + n;
            res += tmp;
            if (n%2==0 && i == 0){
                System.out.print(tmp);
            }else{
                System.out.print("+"+tmp);
            }

        }
        System.out.print("=");
        System.out.print(res);
    }
}
