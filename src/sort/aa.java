package sort;

/**
 * @author lingqu
 * @date 2021/12/4
 * @apiNote
 */
public class aa {
    //public static void main(String[] args) {
    //    int x = 30;
    //    int sum = 0;
    //    for(int i = 26; i > 0; i = i - 2){
    //        sum += i*(i+1)/2;
    //    }
    //    //1729+30
    //    System.out.println(sum);
    //
    //}

    static int arr[]=new int[32];

    static long total=0L;

    static int Judge(int value) {
        if(arr[value-1]==1 || arr[value+1]==1) {
            return 0;    //相邻的灯有灯开
        }
        return 1;
    }

    static void fun(int num) {
        if(num==31) {
            total++;
            return;
        }
        int i=0;
        for(i=0;i<=1;i++) {    //0表示关灯，1表示开灯
            if(i==0) {    //关灯一定可以
                fun(num+1);
            }
            if(i==1) {    //试着开灯
                if(Judge(num)==1) {
                    arr[num]=1;
                    fun(num+1);
                    arr[num]=0;    //回溯
                }
            }
        }
    }

    public static void main(String args[]) {
        fun(1);
        System.out.println(total);
    }
}
