/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        int carryNum,sum,result;
        ListNode preNode = new ListNode(0);
        ListNode currentNode = new ListNode(0);
        preNode.next = currentNode;
        
        sum = l1.val + l2.val;
        carryNum = sum / 10;
        currentNode.val = sum % 10;
        
        l1 = l1.next;
        l2 = l2.next;
  
        while(l1 != null || l2 != null || carryNum != 0) {
            currentNode.next = new  ListNode(0);
            currentNode = currentNode.next;
            
            sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            currentNode.val = (sum % 10 + carryNum) % 10;
            carryNum = (sum + carryNum) / 10;
        
            if(l1 == null && l2 == null && carryNum == 1) 
                return preNode.next;
            
            l1 = l1 != null ? l1.next : l1;
            l2 = l2 != null ? l2.next : l2;
            
        }
        return preNode.next;
        
    }
}