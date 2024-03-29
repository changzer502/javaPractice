package sort;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @author lingqu
 * @date 2021/10/19
 * @apiNote
 */
public class PriorityQueueExample {



    public static void main(String[] args) {
        //优先队列自然排序示例
        Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
        Random rand = new Random();

        for(int i=0;i<7;i++){
            integerPriorityQueue.add(rand.nextInt(100));
        }

        for(int i=0;i<7;i++){
            Integer in = integerPriorityQueue.poll();
            System.out.println("Processing Integer:"+in);
        }

    }














}
