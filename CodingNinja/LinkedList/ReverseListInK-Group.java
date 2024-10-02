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

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node temp;

        while(curr!= null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


    public  static int size(Node head){
        int n = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            n++;
        }
        return n;
    }
    public static Node findkNode(Node head,int k){
        int i = 1;
        while(i<k && head.next!= null){
            head = head.next;
            i++;
            
        }
        if(i==k)
        return head;
        else return null;
    }
    public static Node kReverse(Node head, int k) {
        // Write your code here.
        if(k==0 || head == null|| head.next == null) return head;
        int n = size(head);
        Node temp = head, prev = null, kNode = null;
        Node nex = null;

        while(temp!= null){
            kNode = findkNode(temp,k);
            if(kNode == null){
                prev.next = temp;
                break;
            }
            nex = kNode.next;
            kNode.next = null;
            kNode = reverse(temp);
            if(temp == head){
                head = kNode;
            }else{
                prev.next = kNode;
            }
            prev = temp;
            temp = nex;
        }
        return head;
    }
}
