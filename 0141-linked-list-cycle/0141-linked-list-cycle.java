/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        
        if(head == null){
            return false;
        }
        
        ListNode slwptr = head;
        ListNode fstptr = head;
        
        while(fstptr != null && fstptr.next != null){
            fstptr = fstptr.next.next;
            slwptr = slwptr.next;
            
            if(slwptr == fstptr){
                return true;
            }
        }
        return false;
        
        
    }
}