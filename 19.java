/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode node = head;
        int i = 0,j = 0;
        while(node.next != null) {
            node = node.next;
            i++;
        }
        node = dummy;
        while(j < i - n + 1) {
            node = node.next;
            j++;
        }
        node.next = node.next.next;
        return dummy.next;
    }
}