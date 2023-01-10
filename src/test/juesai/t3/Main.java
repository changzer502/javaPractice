package test.juesai.t3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date newTime = sdf.parse(time);
        time = "2022-10-1";
        Date start = sdf.parse(time);
        long day = (newTime.getTime() - start.getTime()) / (1000 * 3600 * 24) + 1;
        long l = day % 7;
        if (l == 0) {
            System.out.println("徒步远足");
        } else if (l >= 1 && l <= 3) {
            System.out.println("长跑");
        }else if(l>=4&&l<=6){
            System.out.println("爬山");
        }

    }
}
