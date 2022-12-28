package test.challenge.t1;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author changzer
 * @date 2022/12/18
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger bigInteger = new BigInteger("0");
        for (int i = 2; i <= n; i++){
            if (isShu(i)){
                bigInteger = bigInteger.add(big(i));
            }
        }
        bigInteger = bigInteger.remainder(new BigInteger("96577771"));
        System.out.println(bigInteger.toString());
    }

    public static boolean isShu(int num){
        if (num == 2){
            return true;
        }
        for(int i = 2; i*i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static BigInteger big(int num){
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 2; i <= num; i++){
            BigInteger bigInteger1 = new BigInteger(i + "");
            bigInteger = bigInteger.multiply(bigInteger1);
        }
        return bigInteger;
    }
}
