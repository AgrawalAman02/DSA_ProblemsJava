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

public class Solution
{
    public static Node reverseLinkedList(Node head)
    {
        // Write your code here.

        if(head == null) return null;

        Node front = null;
        Node back = null;
        Node temp = head;

        while(temp != null){
            front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
        }
        head = back;
        return head;
    }
}
