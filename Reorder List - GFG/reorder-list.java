//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    Node reorderlist(Node head) {
        // Your code here
        
        if(head == null || head.next == null){
            return head;
        }
        
        Node slwPtr = head,fstPtr=head;
        Node mid = slwPtr;
        
        while(fstPtr != null && fstPtr.next != null){
            mid = slwPtr;
            slwPtr = slwPtr.next;
            fstPtr = fstPtr.next.next;
        }
        
        mid.next = null;
        
        Node rev = reverseHalfLL(slwPtr);
        
        Node iter1 = head,iter2=rev;
        
        while(iter1 != null && iter2 != null){
            Node temp = iter1.next;
            iter1.next = iter2;
            iter1 = temp;
            
            Node temp2 = iter2.next;
            if(iter1 == null){
                break;
            }
            iter2.next = iter1;
            iter2 = temp2;
        }
        return head;
    }
    
    //
    private Node reverseHalfLL(Node head) {
        Node prev = null;
        
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;  
    }
    
    //
    
}
