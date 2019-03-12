/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merger = new ListNode(0);
        ListNode node = merger;
        
        while(l1 != null && l2 != null) {
            
            if(l1.val < l2.val) {
                merger.next = l1;
                l1 = l1.next;
                merger = merger.next;
            } else {
                merger.next = l2;
                l2 = l2.next;
                merger = merger.next;
            }
        }
        if(l1 == null) {
            merger.next = l2;
        }
        if(l2 == null) {
            merger.next = l1;
        }
        return node.next;
    }
}