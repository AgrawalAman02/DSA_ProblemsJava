/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        if(head == null) return 0;
        
        int length = 0;
        Node temp = head;
        
        // Traverse through the list until the end
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        return length;
        
    }
}
