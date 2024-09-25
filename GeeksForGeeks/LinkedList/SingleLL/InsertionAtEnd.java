/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        if (head == null) {
            return new Node(x);
        }
        // code here
        Node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next= new Node(x);
        return head;
    }
}
