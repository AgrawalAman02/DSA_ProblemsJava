/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        Node slow = head;
        Node fast =head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast ){
                slow = head;
                while(slow!=fast){
                    fast  = fast.next;
                    slow = slow.next;
                }
                return slow;

            }
        }

        
        return null;
    }
}
