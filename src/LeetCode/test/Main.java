package LeetCode.test;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author lingqu
 * @date 2021/12/26
 * @apiNote
 */
class Solution {
    public String modifyString(String s) {

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '?'){
                res.append(s.charAt(i));
            }else{
                for (char j = 'a';j<='c';++j){
                    if((i>0 && res.charAt(i-1)==j) || (i < s.length() - 1 && s.charAt(i+1) == j)){
                        continue;
                    }
                    res.append(j);
                    break;
                }
            }
        }
        return res.toString();
    }
}
class Solutio {
    public String modifyString(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            if (arr[i] == '?') {
                for (char ch = 'a'; ch <= 'c'; ++ch) {
                    if ((i > 0 && arr[i - 1] == ch) || (i < n - 1 && arr[i + 1] == ch)) {
                        continue;
                    }
                    arr[i] = ch;
                    break;
                }
            }
        }
        return new String(arr);
    }
}

public class Main {
    int sums(){
        return 2;
    }
    public static void main(String[] args) throws ParseException {
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Date date = simpleDateFormat.parse("2019-10-31");
        //System.out.println(date);
        //1、创建 SimpleDateFormat对象
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ////2、创建Date
        //Date date = new Date();
        ////格式date
        //String str = sdf.format(date);
        //System.out.println(str);
        //
        ////解析把字符串转成日期
        //Date date1 = sdf.parse("2019-10-1");
        //Date date2 = sdf.parse("2019-10-7");
        //long time = date1.getTime();
        //long time2 = date2.getTime();
        //System.out.println(time2-time);

        String a = "aaa";
        String b = "bbb";
        test(a,b);
        String[] aa = new String[2];
        aa[0] = "bbb";
        aa[1] = "ccc";
        test(aa);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.asList(aa).toString());

    }

    public static void test(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] += "123";
        }

    }
}
