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
    public ListNode sortList(ListNode head) {
        
          if (head == null || head.next == null){
            return head;
        }
        
        ListNode preInsert, toInsert, dummyHead = new ListNode(0);
        dummyHead.next = head;

        while (head != null && head.next != null) {
            if (head.val <= head.next.val) {
             head = head.next;
            } else {      
                toInsert = head.next;
                // Locate preInsert.
                preInsert = dummyHead;
                while (preInsert.next.val < toInsert.val) {
                    preInsert = preInsert.next;
                }
                head.next = toInsert.next;
                // Insert toInsert after preInsert.
                toInsert.next = preInsert.next;
                preInsert.next = toInsert;
            }
        }
        
        return dummyHead.next;
    }
}