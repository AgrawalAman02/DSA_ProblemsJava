/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        
        boolean flag = false;
        int i  = 0;
        Node temp  = head;
        while(temp!=null || i<n){
            if(temp.data == key) return true;
            temp= temp.next;
            i++;
        }
        return flag;
    }
}
