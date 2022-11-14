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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head == null){
            return null;
        }
       
        return convertListtoBST(head,null);
        
    }
    
    public TreeNode convertListtoBST(ListNode head,ListNode tail){
        
        if(head == tail){
            return null;
        }
        
        ListNode fstptr = head;
        ListNode slwptr = head;
        
        while(fstptr != tail && fstptr.next != tail){
            slwptr = slwptr.next;
            fstptr = fstptr.next.next;
        }
        
        TreeNode root = new TreeNode(slwptr.val);
        
        root.left = convertListtoBST(head,slwptr);
        root.right = convertListtoBST(slwptr.next,tail);
        
        return root;
    }
    
    
}