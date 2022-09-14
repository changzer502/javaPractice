package LeetCode.路径总和2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/8/21
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Treenode head = new Treenode(1);
        head.left = new Treenode(2);
        head.right = new Treenode(3);
        Solution s = new Solution();
        System.out.println(s.pathSum(head, 3));
    }
}

class Treenode {
    int val;
    Treenode left;
    Treenode right;
    Treenode() {}
    Treenode(int val) { this.val = val; }
    Treenode(int val, Treenode left, Treenode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    List<List<Integer>> res;
    List<Integer> path;
    public List<List<Integer>> pathSum(Treenode root, int targetSum) {
        res = new ArrayList<>();
        path = new ArrayList<>();
        pathS(root,targetSum,0);
        return res;
    }

    public void pathS(Treenode root, int targetSum,int sum) {
        if(root == null){
            return;
        }
        sum += root.val;
        path.add(root.val);

        if(root.left == null && root.right == null){
            if(sum == targetSum){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        if(root.left != null){
            pathS(root.left,targetSum,sum);
            path.remove(path.size()-1);
        }
        if(root.right != null){
            pathS(root.right,targetSum,sum);
            path.remove(path.size()-1);
        }

    }
}
