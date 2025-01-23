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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode current = ans;
        ListNode t1 = list1;
        ListNode t2 = list2;
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                current.next = t1;
                t1 = t1.next;
            } else{
                current.next = t2;
                t2 = t2.next;
            }
            current = current.next;
        }
        if(t1 != null) current.next = t1;
        if(t2 != null) current.next = t2;

        return ans.next;
    }
}