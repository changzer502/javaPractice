package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;


public class Main {
    static PrintWriter out=new PrintWriter(System.out);
    static FastReader in = new FastReader();
    public static void main(String[] args) {
        Integer n = in.nextInt();
        Integer m = in.nextInt();

        Set<Integer>[] set = new HashSet[n];
        for (int i = 0; i < n; i++) {
            set[i] = new HashSet<Integer>();
        }
        for (int i = 0; i<m;i++){
            int f = in.nextInt()-1;
            int t = in.nextInt()-1;
            set[f].add(t);
            set[t].add(f);
        }
        for (int i =0 ; i<n;i++){

        }
        out.print("No suspicious bugs found!");
        out.flush();
    }
}


class FastReader{
    StringTokenizer st;
    BufferedReader br;
    public FastReader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    String next(){
        while (st==null||!st.hasMoreElements()){
            try {
                st=new StringTokenizer(br.readLine());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }
    double nextDouble() {
        return Double.parseDouble(next());
    }
    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}
