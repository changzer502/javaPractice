package PAT.朋友数;

import java.util.*;

/**
 * @author changzer
 * @date 2022/11/12
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //Long sum = 0L;
        //int[] p = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            int sum = 0;
            while(p!=0){
                sum += p%10;
                p/=10;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() >= 1){
                list.add(entry.getKey());
            }
        }
        int size = list.size();
        System.out.println(size);
        Collections.sort(list);
        for (int i = 0; i < size; i++){
            if (i == size-1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + " ");
            }
        }

    }
}
