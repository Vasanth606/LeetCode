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
    ListNode rev(ListNode head){
        if(head == null || head.next == null) return head;
       ListNode pre = null, current = head, nextNode;
        while (current != null) {
            nextNode = current.next;
            current.next = pre;
            pre = current;
            current = nextNode;
        }
        return pre;
    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;       
        for(int i = 1 ; i < l; i++) pre = pre.next;
        ListNode start = pre.next;
        ListNode end = start;
        for(int i = l; i < r; i++) end = end.next;
        ListNode after = end.next;
        end.next = null;
        ListNode revers = rev(start);
        pre.next = revers;
        start.next = after;
        return dummy.next;
    }
}