package PAT.咸鱼的数组;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author changzer
 * @date 2023/2/25
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            for(int j = i+1;j<nums.length; j++){
                set.add(nums[i]+nums[j]);
            }
        }
        System.out.println(set.size());
    }
}
