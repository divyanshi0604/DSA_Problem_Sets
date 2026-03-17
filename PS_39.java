/*39. Reverse a Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.
Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:
Input: head = [1,2]
Output: [2,1]
Example 3:
Input: head = []
Output: [] */

class ListNode {
    int val;
    ListNode
 next; 

    
    ListNode
(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PS_39 {

    
    public static ListNode
 reverseList(ListNode
     head) {
        ListNode
     prev = null;
        ListNode
     curr = head;

        while (curr != null) {
            ListNode
         next = curr.next; // Store next node
            curr.next = prev;       // Reverse the link

            prev = curr;            // Move prev forward
            curr = next;            // Move curr forward
        }
        return prev;
    }

    public static void printList(ListNode
     head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        
        ListNode
     head = new ListNode
    (1);
        head.next = new ListNode
    (2);
        head.next.next = new ListNode
    (3);
        head.next.next.next = new ListNode
    (4);
        head.next.next.next.next = new ListNode
    (5);

        head = reverseList(head);

        printList(head);
    }
}
