package PAT.找素数;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int index = 0;

        for (int i = 2; index < n; i++) {
            if (isSuShu(i)) {
                index++;

                if (index >= m) {
                	if((index - m) == 0){
						System.out.print(i);
					}else if ( (index - m) % 10 == 0) {
                        System.out.println();
						System.out.print(i);
					}else{
						System.out.print( " " + i);
					}
                }
            }
        }
    }

    public static boolean isSuShu(int num) {
        if (num == 2) {
			return true;
		}
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
