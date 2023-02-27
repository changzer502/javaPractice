package PAT.字母排列;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author changzer
 * @date 2023/2/25
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        String[] splits = next.split("");

        TreeSet<String> set = new TreeSet<String>();
        for (String split : splits) {
            set.add(split);
        }
        StringBuilder sb =new StringBuilder();
        for (String string : set) {
            sb.append(string+" ");
        }

        sb.deleteCharAt(sb.length()-1);
        char c3 = sb.charAt(sb.length() - 1);
        char c2 = sb.charAt(sb.length() - 3);

        if (set.size() == 0){
            return;
        }
        if (set.size() == 1){
            System.out.print(sb.toString());
            return;
        }
        if (set.size() == 2){
            System.out.println(sb.toString());
            sb.setCharAt(sb.length() - 1,c2);
            sb.setCharAt(sb.length() - 3,c3);
            System.out.println(sb.toString());
        }
        if (set.size() >= 3){
            char c1 = sb.charAt(sb.length() - 5);
            System.out.println(sb.toString());
            sb.setCharAt(sb.length() - 1,c2);
            sb.setCharAt(sb.length() - 3,c3);
            System.out.println(sb.toString());
            sb.setCharAt(sb.length() - 1,c3);
            sb.setCharAt(sb.length() - 3,c1);
            sb.setCharAt(sb.length() - 5,c2);
            System.out.print(sb.toString());
        }


    }
}
