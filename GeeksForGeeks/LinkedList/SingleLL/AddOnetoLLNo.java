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
    
    public Node reverse(Node head) {
        Node curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public Node add(Node head){
        Node curr = head;
        Node res = head;
        
        Node last  = null;
        
        int carry = 1;
        int sum;
        
        while(curr!= null){
            sum = carry+ curr.data;
            
            carry = (sum>=10) ? 1 : 0;
            
            curr.data = sum%10;
            
            last = curr;
            curr = curr.next;
        }
        
        if(carry >0){
            last.next = new Node(carry);
        }
        
        return res;
    }
    public Node addOne(Node head) {
        // code here.
        head = reverse(head);
        
        head = add(head);
        
        return reverse(head);
        
        
    }
}
