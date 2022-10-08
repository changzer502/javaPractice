package LeetCode.从前序与中序遍历序列构造二叉树;



/**
 * @author lingqu
 * @date 2022/10/8
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] re = new int[]{3,9,20,15,7};
        int[] in = new int[]{9,3,15,20,7};
        s.buildTree(re,in);

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
    public TreeNodes buildTree(int[] preorder, int[] inorder) {
        return buildTree1(preorder,0,preorder.length,inorder,0,inorder.length);
    }
    public TreeNodes buildTree1(int[] preorder,int preLeft,int preRight,int[] inorder,int inLeft,int inRight){
        if(inRight - inLeft <= 0) {
            return null;
        }
        if(inRight - inLeft == 1) {
            return new TreeNodes(inorder[inLeft]);
        }
        int rootVal = preorder[preLeft];
        TreeNodes root = new TreeNodes(rootVal);
        int index = 0;
        for(int i = inLeft;i<inRight;i++){
            if(inorder[i]==rootVal){
                index = i;
                break;
            }
        }
        root.left = buildTree1(preorder,preLeft+1,preLeft+(index-inLeft)+1,inorder,inLeft,index);
        root.right = buildTree1(preorder,preLeft+(index-inLeft)+1,preRight,inorder,index+1,inRight);
        return root;
    }
}

