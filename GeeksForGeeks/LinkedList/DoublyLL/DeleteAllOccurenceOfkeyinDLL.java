/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
	    this.data = data;
	    next = prev = null;
	}
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        Node temp = head;
        if(temp == null) return null;
        
        while(temp!= null){
            if(temp.data == x){
                if(temp.prev == null){
                   head = temp.next; // Move head to the next node
                    // if (head != null) {
                        head.prev = null; // Ensure the new head has no previous node
                    // }
                }else if(temp.next == null){
                    temp.prev.next = temp.next;
                    
                }else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    
                }
                
            }
            temp = temp.next;
        }
        
        return head;
    }
}
