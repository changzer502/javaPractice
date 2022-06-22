package test.ks1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lingqu
 * @date 2022/6/10
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        String str = "123,234,345,456";
        String[] s = str.split(",");
        int sum = 0;
        for (String num: s){
            System.out.println(num);

            sum += Integer.parseInt(num);
        }
        System.out.println(sum);
        String regex = "\\d*";
        Pattern compile = Pattern.compile(regex);
        Matcher adadas = compile.matcher("ad33ada33s");
        while (adadas.find()) {
            String group = adadas.group();
            if (!"".equals(group)){
                System.out.println(group);
            }
        }
    }
}
