package test.ks2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author lingqu
 * @date 2022/6/10
 * @apiNote
 */
public class Main {

    //class tt  {
    //    String a;
    //    int b;
    //    static int c = 20;
    //}

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException,Exception {


        byte b = 'a' + 1;
        File file = new File("./");
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date);
        System.out.println(String.format("%tY-%tm-%td %tH:%tM:%tS", date,date,date,date,date,date));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = new Date();
        String format = sdf.format(d);
        System.out.println(format);
        float f = 11F;
        int i1 = '苹' + '果';
        List<Integer> list = new ArrayList<>();
        list.add(222);
        list.remove(0);
        Integer integer = list.get(0);
        Integer v1 = (int) (Math.random() * 100) + 100;
        Integer i2 = new Random().nextInt(100);
        System.out.println("苹果" + i1);
        double v = Math.random() * 100 + 100;
        Random rand = new Random();
        int i = rand.nextInt(100) + 100;
    }
    public static void sum(){

    }

    public static void sum(int a ){

    }
}
