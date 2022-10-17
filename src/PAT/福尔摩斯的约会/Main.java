package PAT.福尔摩斯的约会;

import java.util.Scanner;

/**
 * @author lingqu
 * @date 2022/10/15
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String s3 = scan.nextLine();
        String s4 = scan.nextLine();
        char[] ch = new char[3];
        int index = 0;
        for(int i =0; i < Math.min(s1.length(), s2.length()); i++) {
            if(s1.charAt(i)>= '0' && s1.charAt(i)<= '9'){
                continue;
            }
            if(index == 2) break;
            if(s1.charAt(i) == s2.charAt(i)){
                ch[index++] = s1.charAt(i);
            }
        }
        for(int i =0; i < Math.min(s3.length(), s4.length()); i++) {
            if(index == 3) {
                break;
            }
            if(s3.charAt(i) == s4.charAt(i)){
                ch[index++] = s1.charAt(i);
            }
        }
        if(ch[0] == 'A' || ch[0] == 'a'){
            System.out.print("MON ");
        }else if (ch[0] == 'B' || ch[0] == 'b'){
            System.out.print("TUE ");
        }else if (ch[0] == 'C' || ch[0] == 'c'){
            System.out.print("WED ");
        }else if (ch[0] == 'D' || ch[0] == 'd'){
            System.out.print("THU ");
        }else if (ch[0] == 'E' || ch[0] == 'e'){
            System.out.print("FRI ");
        }else if (ch[0] == 'F' || ch[0] == 'f'){
            System.out.print("SAT ");
        }else if (ch[0] == 'G' || ch[0] == 'g'){
            System.out.print("SUN ");
        }
        if (ch[1] >= '0' && ch[1] <= '9'){
            System.out.printf("%2d:",ch[1]-'0');
        }else if (ch[1] == 'A'){
                System.out.print(10+":");
            }else if (ch[1] == 'B'){
                System.out.print(11+":");
            }else if (ch[1] == 'C'){
                System.out.print(12+":");
            }else if (ch[1] == 'D'){
                System.out.print(13+":");
            }else if (ch[1] == 'E'){
                System.out.print(13+":");
            }else if (ch[1] == 'F'){
                System.out.print(13+":");
            }else if (ch[1] == 'G'){
                System.out.print(13+":");
            }else if (ch[1] == 'H'){
                System.out.print(13+":");
            }else if (ch[1] == 'I'){
                System.out.print(13+":");
            }else if (ch[1] == 'J'){
                System.out.print(13+":");
            }else if (ch[1] == 'L'){
                System.out.print(13+":");
            }else if (ch[1] == 'M'){
                System.out.print(13+":");
            }else if (ch[1] == 'N'){
                System.out.print(13+":");
            }
        System.out.printf("%02d",ch[2]-'0');

    }
}
