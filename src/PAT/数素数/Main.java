package PAT.数素数;


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();
        int count = 0;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; count != end; i++){
            if(isP(i)){
                count++;
                if(start<=count && count < end ){
                    //按格式输出
                        if( (count - start + 1) % 10 == 0) {
                            System.out.println(i);
                        } else {
                            System.out.print(i+" ");
                        }
                }else if(count == end) {
                    System.out.print(i);
                }
            }
        }
    }
    public static boolean isP(int x){
        if(x < 2) {
            return false;
        }
        for(int i = 2; i*i <= x; i++){
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }
}
