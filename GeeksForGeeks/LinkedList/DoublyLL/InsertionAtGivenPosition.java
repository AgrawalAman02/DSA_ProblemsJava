class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        if(p==0){
            Node temp = new Node(x);
            temp.next = head;
            if(head != null){
                head.prev = temp;
                head = head.prev;
            }
            head = temp;
        }else{
            int i = 0;
            Node temp  = head;
            while(i<p && temp!=null){
                temp= temp.next;
                i++;
            }
            if(temp!=null){
                Node pt = new Node(x);
                pt.next = temp.next;
                pt.prev = temp;
                if(temp.next!=null){
                    temp.next.prev = pt;
                }
                temp.next = pt;
            }
            
        }
        return head;
    }
}
