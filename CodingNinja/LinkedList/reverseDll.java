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
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        if(head == null )return null;

        Node temp = head;
        Node newHead = null;

        while(temp!= null){
            Node arb = temp.next;
            temp.next= temp.prev;
            temp.prev = arb;
            newHead = temp;
            temp = temp.prev;
        }

        return newHead;
    }
}
