package test;

import java.util.*;

/**
 * @author lingqu
 * @date 2022/6/7
 * @apiNote
 */
public class tt {
    public static void main(String[] args) {
        //int x = 1;
        //
        ////char m = 'a' + x;
        //char c = 'a' + 1;
        //
        //System.out.println(c);
        String address = "1.1.1.1";
        System.out.println(address.replace(".", "[.]"));
    }

    private tt() {
    }
}
class Hello {
    Hello(int m) {

    }
    int Hello(){
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Integer i : set){
            System.out.println(i);
        }

        Map<Integer,String> map = new HashMap<>();
        for(Integer i : map.keySet()){
            String integer = map.get(i);
        }
        return 1;

    }

    void isPrimeNum(int n) {
        for(int i=2;i<n;i++) {
            boolean flag = true;
            for(int j=2;j<Math.sqrt(i);j++) {
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(" " + i);
            }
        }
    }
    abstract class ttt {
        abstract void aaa();
    }
}

