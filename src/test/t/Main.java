package test.t;

/**
 * @author lingqu
 * @date 2022/9/24
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(a());
    }
    public static int a(){
        int res = 0;
        P a = new P();
        try{
            res = 1;
            int i = 1 / 0;
            return res;
        }catch(Exception e){
            res++;
            return res;
        }finally {
            res = 5;
        }
    }

    static class P{
        int a;
        int b;
    }
}
