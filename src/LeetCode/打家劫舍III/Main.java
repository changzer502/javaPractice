package LeetCode.打家劫舍III;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lingqu
 * @date 2022/10/12
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        TreeNodes root = new TreeNodes(3);
        TreeNodes root1 = new TreeNodes(2);
        TreeNodes root2 = new TreeNodes(3);
        TreeNodes root3 = new TreeNodes(3);
        TreeNodes root4 = new TreeNodes(1);
        root.left = root1;
        root.right = root2;
        root1.right = root3;
        root2.right = root4;
        Solution s = new Solution();
        System.out.println(s.rob(root));
    }
}

//Definition for a binary tree node.
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
    List<Integer> dp;
    public int rob(TreeNodes root) {
        dp = new ArrayList<>();
        Queue<TreeNodes> q = new LinkedList<>();
        q.add(root);
        int index = 0;
        while(!q.isEmpty()){
            Queue<TreeNodes> qt = new LinkedList<>();
            while(!q.isEmpty()){
                TreeNodes poll = q.poll();
                dp.add(poll.val);
                if(root.left!=null){
                    qt.add(root.left);
                }
                if(root.right!=null){
                    qt.add(root.right);
                }
                if(index == 0){
                    dp.add(root.val);
                }else if(index == 1){
                    if(dp.size() >= index+1){
                        dp.set(index,Math.max(dp.get(index) + root.val,dp.get(0)));
                    }else {
                        dp.add(Math.max(root.val,dp.get(0)));
                    }
                }else {
                    if(dp.size() >= index+1){
                        dp.set(index,Math.max(dp.get(index-2)+dp.get(index)+root.val, dp.get(index-1)));
                    }else{
                        dp.add(Math.max(dp.get(index-2)+root.val, dp.get(index-1)));
                    }
                }
            }
            index++;
            q = qt;
        }
        return dp.get(dp.size()-1);
    }

}
