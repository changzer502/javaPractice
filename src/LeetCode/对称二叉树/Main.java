package LeetCode.对称二叉树;

/**
 * @author lingqu
 * @date 2022/3/27
 * @apiNote
 */

/**
 * Definition for a binary tree node.*/
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
    public boolean isSymmetric(TreeNodes root) {
        return dfs(root,root);
    }
    boolean dfs(TreeNodes left,TreeNodes right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        return left.val == right.val && dfs(left.left, right.right) && dfs(left.right,right.left);
    }
}
public class Main {
}
