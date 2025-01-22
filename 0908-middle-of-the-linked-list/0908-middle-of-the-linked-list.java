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
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        ListNode temp = head;
        ListNode mid = head;
        boolean isEven = false;
        while(temp.next != null){
            isEven = !isEven;
            temp = temp.next;
            if(isEven) mid = mid.next;
        }
        return mid;
    }
}