package test.juesai.t1;

import java.util.Scanner;

public class Main {
    static int res = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] sd = new int[M];
        for (int i = 0; i < M; i++){
            sd[i] = sc.nextInt();
        }

        huis(sd,N,0,0);
        System.out.println(res);
    }

    private static void huis(int[] sd,int N, int sum,int i) {

        if (sum == N){
            res++;
            return;
        }else if(sum>N){
            return;
        }
        if (i>=sd.length){
            return;
        }
        huis(sd,N,sum+sd[i],++i);
        huis(sd,N,sum,i);
    }
}
