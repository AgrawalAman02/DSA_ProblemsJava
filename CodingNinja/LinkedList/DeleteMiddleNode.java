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
 };

 *****************************************************************/

public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
         int len = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            len++;
        }
        if(len == 1) return null;
        int n = len/2;

        temp = head;
        int i = 0;
        while(i<n-1){
            temp = temp.next;
            i++;
        }
        if(temp.next != null && temp != null)
            temp.next = temp.next.next;
        
        return head;
    }
}
