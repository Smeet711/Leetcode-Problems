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
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        
        
        ListNode last = head.next;
        ListNode sLast = head;
        
        while(last.next != null){
            last = last.next;
            sLast = sLast.next;
        }
        
        ListNode temp = head.next;
        head.next = last;
        last.next = temp;
        sLast.next = null;
        
        reorderList(temp);
        
    }
}