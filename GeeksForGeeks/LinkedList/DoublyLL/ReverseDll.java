/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if (head == null) return null;
        
        DLLNode temp = head;
        DLLNode newHead = null;
        while(temp!= null){
            DLLNode arb = temp.next;
            temp.next = temp.prev;
            temp.prev = arb;
            newHead = temp; // Update new head
            temp = temp.prev;
        }
        return newHead;
    }
}
