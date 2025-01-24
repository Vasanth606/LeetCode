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
        int n = list.length; // Total number of lists
        while (n > 1) {
        int k = (n + 1) / 2; // Calculate the number of pairs to merge
        for (int i = 0; i < n / 2; i++) {
        list[i] = merge(list[i], list[i + k]); // Merge pairs
    }
    n = k; // Update the number of lists to the new merged count

}
    return list[0];
    }
}