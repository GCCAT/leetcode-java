/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode node = head;
        int i = 0,len;
        while(node != null) {
            node = node.next;
            i++;
        }
        len = i;
        if(k > len) return head;
        ListNode[] cycle = new ListNode[k];
        node = head;
        i = 0;
        while(i < k) {
            cycle[i] = node;
            node = node.next;
            i++;
        }
        i = k - 1;
        while(i > 0) {
            cycle[i].next = cycle[i - 1];
            i--;
        }
        cycle[0].next = reverseKGroup(node,k);
        return cycle[k - 1];
    }
}