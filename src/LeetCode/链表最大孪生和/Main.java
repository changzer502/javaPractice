package LeetCode.链表最大孪生和;

/**
 * @author lingqu
 * @date 2022/1/8
 * @apiNote
 */

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public int pairSum(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int[] nums = new int[count/2];
        curr = head;
        int c = 1;
        for(int i = 0; i < count; i++){
            if(i<count/2){
                nums[i] = curr.val;
            }else{

                nums[i-c] += curr.val;
                c+=2;
            }
            curr = curr.next;
        }
        int max = nums[0];
        for(int i:nums){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ListNode a = listNode;
        a.val=5;
        a.next = new ListNode();
        a = a.next;
        a.val = 4;
        a.next = new ListNode();
        a = a.next;
        a.val = 2;
        a.next = new ListNode();
        a = a.next;
        a.val = 1;
        Solution s = new Solution();
        System.out.println(s.pairSum(listNode));

    }
}
