/*
Geek is learning data structures and is familiar with linked lists, but he's curious about how to access the previous element in a linked list in the same way that we access the next element. 
His teacher explains doubly linked lists to him.

Given an integer array arr of size n. Construct the doubly linked list from arr and return the head of it.
*/

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head = new Node(arr[0]);
        Node p = head;
        
        for(int i = 1; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            temp.prev = p;
            p.next = temp;
            p = p.next;
            
        }
        return head;
    }
}
