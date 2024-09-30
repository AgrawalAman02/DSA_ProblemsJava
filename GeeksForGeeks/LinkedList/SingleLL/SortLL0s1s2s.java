// first approach to sort it so that then we got 0s , 1s and 2s in correct place
// time comp = O(nlog(n));
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    
    static Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }

        return dummy.next;
    }

    static Node middlell(Node head){
        if(head == null || head.next == null) return head;

        Node fast = head.next;
        Node slow = head;
        
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    
    static Node segregate(Node head) {
        // add your code here
        if(head ==null || head.next == null) return head;

        Node middle = middlell(head);
        Node left = head;
        Node right = middle.next;
        middle.next = null;

        left = segregate(left);
        right = segregate(right);

        return merge(left,right);
    }
}


