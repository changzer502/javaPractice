package Byte.t1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ars = in.next();
        String[] arr = ars.substring(1,ars.length()-2).split(",");
        int n = in.nextInt();
        int x = 0;
        for(int i = n; x < arr.length; x++, i++){
            if(arr[i % arr.length].compareTo(arr[(i + 1) % arr.length]) > 0){
                System.out.println("true");
                break;
            }
        }
        if(x == arr.length){
            System.out.print("false");
        }

    }
}
