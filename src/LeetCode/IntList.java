package LeetCode;

/**
 * @author lingqu
 * @date 2021/12/7
 * @apiNote
 */
public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /** Return the size of the list using... recursion! */
    public int size() {
        if(rest == null){
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Return the size of the list using no recursion! */
    public int iterativeSize() {
        IntList p = this;
        int i = 0;
        while(p != null){
            i++;
            p = p.rest;
        }
        return i;
    }

    /** Returns the ith value in this list.*/
    public int get(int i) {
        if(i == 0){
            return first;
        }else {
            return this.rest.get(i-1);
        }
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        IntList q = new IntList(L.first + x,null);
        IntList q1 = q;
        IntList l1 = L;
        while(l1.rest != null){
            l1 = l1.rest;
            q1.rest = new IntList(l1.first + x,null);

            q1 = q1.rest;
        }
        return q;
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
        IntList ll = L;
        while(ll.rest!=null){
            ll.first = ll.first + x;
            ll = ll.rest;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        System.out.println(L.get(1));
        System.out.println(incrList(L, 3).get(0) + "===");
        System.out.println(dincrList(L, 3).get(0) +"===");
        System.out.println(L.iterativeSize());
    }
}
