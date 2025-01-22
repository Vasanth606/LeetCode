/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode pre = new ListNode(temp.val);
        while(temp.next != null){
            temp = temp.next;
            ListNode newNode = new ListNode(temp.val);
            newNode.next = pre;
            pre = newNode;
        }
        return pre;
    }
}