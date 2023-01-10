package test.juesai.t5;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        String[][] p = new String[n][2];
        for (int i = 0; i < n; i++){
            String[] split = sc.next().split(":");
            p[i][0] = split[0];
            p[i][1] = split[1];
        }
        sort(p);
        TreeMap<String,String> map = new TreeMap<>();
        int[][] t = new int[num][3];
        int res = -1;
        boolean f = true;
        int tt = 0;
        for (int i = 0; i < p.length; i++){
            if (f){
                tt++;
                if (tt==num-1){
                    f=!f;
                }
            }else{
                tt--;
                if (tt==0){
                    f=!f;
                }
            }
            t[tt][1]++;
            t[tt][2]+=Integer.parseInt(p[i][1]);
            if (t[tt][2]>res){
                res = t[tt][2];
            }
            map.put(p[i][0],tt+1+"-"+t[tt][1]);
        }
        System.out.println(res);
        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
    public static  void sort(String [][] arr){
        for (int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String[] str=null;
                if(compare(arr[i][1],arr[j][1])>0){
                    str=arr[j];
                    arr[j]=arr[i];
                    arr[i]=str;
                }
            }

        }
    }


    public static int compare(String s1, String s2) {
        return Integer.parseInt(s2)-Integer.parseInt(s1);
    }
}
