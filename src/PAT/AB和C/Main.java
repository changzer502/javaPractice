package PAT.AB和C;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            long a = scan.nextLong();
            long b = scan.nextLong();
            long c = scan.nextLong();
            if(a+b > c){
                System.out.println("Case #"+(i+1)+": true");
            }else{
                System.out.println("Case #"+(i+1)+": false");
            }
        }
    }
}
