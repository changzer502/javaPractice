package sort;

import java.util.Scanner;

/**
 * @author lingqu
 * @date 2021/10/31
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer res = new StringBuffer();
        while (scanner.hasNextLine()) {
            res.append(scanner.nextLine());
        }
        //System.out.println(str);
        //for(int i=str.length()-1,j=str.length()-1; i>=0; i--){
        //    if(str.charAt(i) == ' '||i==0){
        //        res.append(str.substring(i,j+1));
        //        res.append(' ');
        //        j=i-1;
        //    }
        //}
        //str = res.toString().trim();
        System.out.println(str);
    }
}
