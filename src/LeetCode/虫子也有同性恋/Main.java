package LeetCode.虫子也有同性恋;

import java.util.*;

/**
 * @author changzer
 * @date 2023/2/25
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Set<Integer> set[] = new Set[n];
        for (int i = 0; i < n; i++) {
            set[i]=(new HashSet<Integer>()) ;
        }
        for (int i = 0; i<m;i++){
            int f = scan.nextInt()-1;
            int t = scan.nextInt()-1;
            set[f].add(t);
            set[t].add(f);
        }
        for (int i = 0; i < n; i++){
            for (int tt:set[i]){
                if (set[i].contains(set[tt])){

                }
                for (int k:set[tt]){
                    if (k!=i&&set[i].contains(k)){
                        System.out.println("Suspicious bugs found!");
                        return;
                    }
                }
            }
        }
        System.out.println("No suspicious bugs found!");
    }
}


