package PAT.有多少个ACM;

import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/11/12
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int a = 0;
        int c = 0;
        int res = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A') {
                a++;
            } else if (chars[i] == 'C') {
                c += a;
            } else {
                res += c % 1000000007;
            }
        }
        System.out.println(res % 1000000007);
    }

}
