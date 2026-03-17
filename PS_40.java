/*0. Detect Loop in Linked List
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by
continuously following the next pointer. Internally, pos is used to denote the index of the node that
tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.
Example 1:
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed) */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class PS_40 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;           
            fast = fast.next.next;      

            if (slow == fast) {
                return true;
            }
        }
        return false;
    } 

    public static void main(String[] args) {
        PS_40 solver = new PS_40();

        //  Create nodes: 3 -> 2 -> 0 -> -4
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node0 = new ListNode(0);
        ListNode nodeNeg4 = new ListNode(-4);

        //Link them
        head.next = node2;
        node2.next = node0;
        node0.next = nodeNeg4;

        // Create a cycle: point -4 back to 2
        nodeNeg4.next = node2;

        // 4. Test and Print
        boolean result = solver.hasCycle(head);
        System.out.println("Has Cycle: " + result);
    }
}
