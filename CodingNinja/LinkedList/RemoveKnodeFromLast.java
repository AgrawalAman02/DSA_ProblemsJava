/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    // public static Node removeKthNode(Node head, int K)
    // {
    //     // Write your code here.
        
    //     int i = 1;
    //     Node fast = head;
    //     Node slow = head;
    //     Node temp = null;

    //     while(i<K && fast != null){
    //         fast = fast.next;
    //         i++;
    //     }

    //     while(fast.next!= null){
    //         fast = fast.next;
    //         temp = slow;
    //         slow= slow.next;
    //     }

    //     if(slow == head) return head.next;
    //     temp = slow.next;
    //     return head;

        
    // }

    public static Node removeKthNode(Node head, int K) {
    if (head == null || K <= 0) {
        return head; // Edge case: if list is empty or K is invalid, return original head
    }

    Node fast = head;
    Node slow = head;
    Node temp = null;

    // Move fast pointer K steps ahead
    for (int i = 1; i <= K && fast != null; i++) {
        fast = fast.next;
    }

    // Traverse until fast pointer reaches end
    while (fast != null) {
        temp = slow;
        slow = slow.next;
        fast = fast.next;
    }

    // Now slow points to the Kth node from the end
    // Remove slow node
    if (temp == null) {
        // If temp is null, it means we need to remove the head
        head = head.next;
    } else {
        // Otherwise, adjust pointers to remove slow node
        temp.next = slow.next;
        if (slow.next != null) {
            slow.next.prev = temp;
        }
    }

    return head;
}

}
