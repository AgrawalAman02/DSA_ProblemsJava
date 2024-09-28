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

public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here

        if(head == null) return 0;
        // int len = 0;
        Node slow = head;
        Node fast = head;
        
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            // len++;
            
            if(slow == fast ){
                // return len;
                slow = head;
                
                
                while(slow!= fast ){
                    slow = slow.next;
                    fast = fast.next;
                    // len++;
                }
                int len = 1;
                fast = fast.next;
                while(fast!= slow){
                    fast = fast.next;
                    len++;
                }
                
                return len;
                
            }
        }
        
        return 0;
    }
}
