package LeetCode.找树左下角的值;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lingqu
 * @date 2022/6/22
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNodes t = new TreeNodes(2);
        t.left = new TreeNodes(1);
        t.right = new TreeNodes(3);
        s.findBottomLeftValue(t);
    }
}


class TreeNodes {
    int val;
    TreeNodes left;
    TreeNodes right;
    TreeNodes() {}
    TreeNodes(int val) { this.val = val; }
    TreeNodes(int val, TreeNodes left, TreeNodes right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int findBottomLeftValue(TreeNodes root) {
        Queue<TreeNodes> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while(queue.size() > 0) {
            Queue<TreeNodes> tQueue = new LinkedList<>();
            boolean flag = true;
            int num = 0;
            TreeNodes first = queue.peek();

            while(queue.size() > 0) {
                TreeNodes tt = queue.poll();

                if (tt.left != null) {
                    tQueue.add(tt.left);
                    num++;
                }
                if (tt.right != null) {
                    tQueue.add(tt.right);
                    num++;
                }

            }
            queue = tQueue;
            if (num == 0) {
                res = first.val;
            }
        }
        return res;
    }
}
