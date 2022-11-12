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
    ListNode ref;
    public boolean isPalindrome(ListNode head) {
        
        ref = head;
        return isCheck(ref);
       
        
    }
    
    public boolean isCheck(ListNode node){
        if(node == null){
            return true;
        }
        
        boolean ans = isCheck(node.next);
        boolean isPali = (ref.val == node.val) ? true:false;
        
        ref = ref.next;
        return ans && isPali;
        
        
    }
    
}