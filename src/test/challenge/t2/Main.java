package test.challenge.t2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/12/18
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        char[] chars = next.toCharArray();
        Arrays.sort(chars);
        if (chars[0] != '0'){
            System.out.print(new String(chars));
        }else if (chars[chars.length - 1] == '0'){
            System.out.println(0);
        }else {
            int k = 0;
            for (;k<chars.length;k++) {
                if (chars[k] != '0'){
                    System.out.print(chars[k]);
                    break;
                }
            }
            for (int i = 0; i < chars.length; i++) {
                if (i!=k){
                    System.out.print(chars[i]);
                }
            }
        }
    }
}
