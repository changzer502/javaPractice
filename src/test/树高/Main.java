package test.树高;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lingqu
 * @date 2022/10/5
 * @apiNote
 */
public class Main {
    public static void main(String[] args) {
        Node root = new Node(0,new ArrayList<>());
        Node n1 = new Node(1,new ArrayList<>());
        Node n2 = new Node(2,new ArrayList<>());
        Node n3 = new Node(3,new ArrayList<>());
        List<Node> nodes = new ArrayList<>();
        nodes.add(n1);
        nodes.add(n2);
        nodes.add(n3);
        root.children=nodes;

        Node n4 = new Node(4,new ArrayList<>());
        Node n5 = new Node(5,new ArrayList<>());
        nodes = new ArrayList<>();
        nodes.add(n4);
        nodes.add(n5);
        n1.children = nodes;
        Solution s = new Solution();
        System.out.println(s.maxDepth(root));
    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public int maxDepth(Node root) {
        //if(root==null) {
        //    return 0;
        //}
        int max = 0;
        for(Node ch: root.children){
            max = Math.max(max,maxDepth(ch));
        }
        return ++max;
    }
}
