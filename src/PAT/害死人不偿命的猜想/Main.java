package PAT.害死人不偿命的猜想;

import java.util.Scanner;

/**
 * @author lingqu
 * @date 2022/10/15
 * @apiNote
 */
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int res = 0;
        while(i!=1){
            res++;
            if(i%2==0){
                i=i/2;
            }else {
                i = (3*i+1)/2;
            }
        }
        System.out.print(res);
    }
}
