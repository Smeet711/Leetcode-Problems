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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    ListNode dummy = new ListNode(0);
    ListNode slowPtr = dummy,fstPtr = dummy;
    slowPtr.next = head;
    
    //Move fast in front so that the gap between slow and fast becomes n
    for(int i=1; i<=n+1; i++)   {
        fstPtr = fstPtr.next;
    }
    //Move fast to the end, maintaining the gap
    while(fstPtr != null) {
        slowPtr = slowPtr.next;
        fstPtr = fstPtr.next;
    }
    //Skip the desired node
    slowPtr.next = slowPtr.next.next;
    return dummy.next;     
    }
}