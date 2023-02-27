package PAT.区间操作;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author changzer
 * @date 2023/2/25
 * @apiNote
 */
public class Main {
    static PrintWriter out=new PrintWriter(System.out);
    static FastReader in = new FastReader();
    public static void main(String[] args) {
        int n = in.nextInt();
        int m = in.nextInt();
        Long[] nums = new Long[n];

        for (int i = 0; i < nums.length; i++){
            nums[i] = in.nextLong();
        }
        //in.nextLine().split(" ");
        for (int i = 0; i < m; i++){
            String[] s = in.nextLine().split(" ");
            int start = Integer.parseInt(s[1]);
            int end = Integer.parseInt(s[2]);
            if (start > end){
                int tt = start;
                start = end;
                end = tt;
            }
            if ("1".equals(s[0])){

                Long add = Long.parseLong(s[3]);
                for (int j = start-1; j <= end-1; j++){
                    nums[j] += add;
                }
            }else{
                Long temp = 0L;
                for (int j = start-1; j <= end-1; j++){
                    temp +=nums[j];
                }
                out.println(temp);
            }
        }
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

