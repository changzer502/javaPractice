package sort;

        import java.util.Scanner;

/**
 * @author lingqu
 * @date 2021/10/28
 * @apiNote
 */
public class time {
    public static void main(Main[] args) {
        Scanner scanner = new Scanner(System.in);
        Long x =scanner.nextLong();

        x=x/1000;
        Long s = x%60;
        Long m = x/60%60;
        Long h = x/60/60%24;
        StringBuffer stringBuffer = new StringBuffer();
        if(h<10){
            stringBuffer.append("0");
            stringBuffer.append(h);
            stringBuffer.append(":");
        }else {
            stringBuffer.append(h);
            stringBuffer.append(":");
        }
        if(m<10){
            stringBuffer.append("0");
            stringBuffer.append(m);
            stringBuffer.append(":");
        }else {
            stringBuffer.append(m);
            stringBuffer.append(":");
        }

        if(s<10){
            stringBuffer.append("0");
            stringBuffer.append(s);
        }else {
            stringBuffer.append(s);
        }
        System.out.println(stringBuffer);

    }
}
