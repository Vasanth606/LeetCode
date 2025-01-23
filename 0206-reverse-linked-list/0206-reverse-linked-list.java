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
        ListNode curr = head;
        ListNode Next = curr.next;
        ListNode pre = null;
        while(curr != null){
            Next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = Next;
        }
        return pre;
    }
}