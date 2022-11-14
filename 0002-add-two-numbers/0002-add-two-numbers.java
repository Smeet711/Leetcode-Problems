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
    int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
//         ListNode dummynode = new ListNode();
        
//         ListNode temp = dummynode;
        
//         int carry=0;
//         int sum;
        
//         while(l1 != null || l2 != null || carry == 1){
        
//             sum = 0;
        
//         if(l1 != null){
//             sum += l1.val;
//             l1 = l1.next;
//         }
//         if(l2 != null){
//             sum += l2.val;
//             l2 = l2.next;
//         }
            
//             sum += carry;
//             carry = sum / 10;
            
//             ListNode newnode = new ListNode(sum%10);
//             temp.next = newnode;
//             temp = temp.next;
//         }
        
//         return dummynode.next;
        
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }
        
        int value1 = l1 == null ? 0 : l1.val;
        int value2 = l2 == null ? 0 : l2.val;
        
        int sum = value1+value2+carry;
        carry = sum/10;
        
        
        l1 = l1 == null ? null :l1.next;
        l2 = l2 == null ? null :l2.next;
        
       ListNode ans = new ListNode(sum%10,addTwoNumbers(l1,l2));
        
        return ans;
    }
}