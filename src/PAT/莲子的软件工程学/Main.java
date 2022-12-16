package PAT.莲子的软件工程学;

import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/11/26
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        if (b > 0){
            System.out.println(Math.abs(a));
        }else if (b<0){
            System.out.println(-1*Math.abs(a));
        }else{
            System.out.println(0);
        }
    }
}
