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
    public ListNode partition(ListNode head, int x) {
        
        ListNode leftSublist = new ListNode(0);
        ListNode rightSublist = new ListNode(0);
        
        ListNode leftTail = leftSublist;
        ListNode rightTail = rightSublist;
        
        while(head != null){
            if(head.val < x){
                leftTail.next = head;
                leftTail = leftTail.next;
            }else{
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next; 
        }
        
        leftTail.next = rightSublist.next;
        rightTail.next = null;
        
        return leftSublist.next;
    }
}