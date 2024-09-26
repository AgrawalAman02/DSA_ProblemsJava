/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        int i = 1;
        
        if(x==1){
            if(head!= null){
                head  = head.next;
                head.prev = null;
            }
        }else{
            Node temp = head;
            while(i<x-1){
                temp = temp.next;
                i++;
            } 
            if(temp.next.next == null){
                temp.next = null;
            }else{
                temp.next.next.prev= temp;
                temp.next = temp.next.next;
                
            }
           
        }
        return head;
        
    }
}
