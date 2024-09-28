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

     public static Node reverse(Node head){
        Node tail = head;
        Node temp = head;
        Node front = null;

        while(temp!= null){
            tail  = temp.next;
            temp.next = front;
            front = temp;
            temp = tail;
        }
        return front;

    }
    public static boolean isPalindrome(Node head) {
        // write your code here
        if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;
        }

        Node fast = head;
        Node slow = head;

        while(fast.next!= null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node nHead = reverse(slow.next);
        // reverse the second half
        
        Node temp = head;
        while(nHead!= null){
            if(temp.data == nHead.data){
                nHead = nHead.next;
                temp= temp.next;
            }
            else return false;
        }


        return true;
    }
}
