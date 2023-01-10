package test.juesai.t4;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int[] ints = new int[20];
        ints[0]=a1;
        ints[1]=a2;
        for (int i = 2; i < 20; i++){
            if (i%2==1){
                ints[i] = (ints[i-1]+ints[i-2])%1000;
            }else{
                int i1 = ints[i - 1] * ints[i - 2];
                if (i1>1000){
                    int i2 = i1 / 1000;
                    int i3 = i1 % 100;
                    ints[i] = i2+i3;
                }else {
                    ints[i] = i1;
                }
            }
        }
        for (int i=0;i<ints.length;i++) {
            if (i==0){
                System.out.print(ints[i]);
            }else {
                System.out.print(" "+ints[i]);
            }
        }
        System.out.println();
        Random rand = new Random(988);
        int[] r = new int[5];
        for (int i = 0; i < 5; i++){
            int i1 = rand.nextInt(20)+1;
            if (i==0){
                System.out.print(i1);
            }else{
                System.out.print(" "+i1);
            }
            r[i] = i1;
        }
        System.out.println();
        for (int i=0;i<r.length;i++){
            if (i==0){
                System.out.print(ints[r[i]-1]);
            }else {
                System.out.print(" "+ints[r[i]-1]);
            }
        }
    }
}
