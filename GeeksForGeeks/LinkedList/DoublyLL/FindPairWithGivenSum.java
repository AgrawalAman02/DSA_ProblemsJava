/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;
    
    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        Node tail = head;
        Node front = head;
        
        while(tail.next != null){
            tail= tail.next;
        }
        
        ArrayList<ArrayList<Integer>>  arr = new ArrayList<>();
        while(front != tail && front.prev != tail){
            if(front.data + tail.data== target){
                ArrayList<Integer> a  = new ArrayList<>();
                a.add(front.data);
                a.add(tail.data);
                arr.add(a);
                front = front.next;
                tail = tail.prev;
            }else if(front.data + tail.data> target) tail = tail.prev;
            else front = front.next;
        }
        
        return arr;
    }
}
        
