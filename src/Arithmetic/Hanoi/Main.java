package Arithmetic.Hanoi;

import java.util.Arrays;

/**
 * @author lingqu
 * @date 2022/1/16
 * @apiNote
 */
public class Main {
    public static void print_move(int origin, int destination){
        System.out.println("Move the top disk from rod "+ origin+ "to rod "+ destination);
    }
    public static void move_stack(int n, int start, int end){
        /**
         * Print the moves required to move n disks on the start pole to the end
         *     pole without violating the rules of Towers of Hanoi.
         *
         *     n -- number of disks
         *     start -- a pole position, either 1, 2, or 3
         *     end -- a pole position, either 1, 2, or 3
         *
         *     There are exactly three poles, and start and end must be different. Assume
         *     that the start pole has at least n disks of increasing size, and the end
         *     pole is either empty or has a top disk larger than the top n start disks.
         *
         *     >>> move_stack(1, 1, 3)
         *     Move the top disk from rod 1 to rod 3
         *     >>> move_stack(2, 1, 3)
         *     Move the top disk from rod 1 to rod 2
         *     Move the top disk from rod 1 to rod 3
         *     Move the top disk from rod 2 to rod 3
         *     >>> move_stack(3, 1, 3)
         *     Move the top disk from rod 1 to rod 3
         *     Move the top disk from rod 1 to rod 2
         *     Move the top disk from rod 3 to rod 2
         *     Move the top disk from rod 1 to rod 3
         *     Move the top disk from rod 2 to rod 1
         *     Move the top disk from rod 2 to rod 3
         *     Move the top disk from rod 1 to rod 3
         */
        if(n==1){
            print_move(start, end);
            return;
        }
        move_stack(n-1,start,6-start-end);
        move_stack(1,start,end);
        move_stack(n-1,6-start-end, end);
    }
    public static void main(String[] args) {
        move_stack(3,1,3);
    }
}
