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
    ListNode merge(ListNode h1,ListNode h2) {
        ListNode ans = new ListNode(-1);
        ListNode t1 = h1;
        ListNode t2 = h2;
        ListNode curr = ans;
        while(t1 != null && t2 != null){
            if(t1.val < t2.val){
                curr.next = t1;
                t1 = t1.next;
            }else{
                curr.next = t2;
                t2 = t2.next;
            }
            curr = curr.next;
        }
        if(t1 != null) curr.next = t1;
        if(t2 != null) curr.next = t2;
        return ans.next;
   }
    public ListNode mergeKLists(ListNode[] list) {
        if(list == null || list.length == 0) return null;
        ListNode res  = list[0];
        for(int i = 1; i < list.length; i++){
            res = merge(res,list[i]);
        }
        return res;
    }
}