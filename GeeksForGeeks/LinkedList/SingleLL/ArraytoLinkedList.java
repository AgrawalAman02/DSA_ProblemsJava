//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;




// } Driver Code Ends


// User function Template for Java


// class Node {
//     int data;
//     Node next;

//     Node() { data = 0; }
//     Node(int d) { 
//         data = d;
//         next = null;
//     }  //constructor to create a new node
// }

class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node head = new Node(arr[0]);
        Node p = head;
        
        for(int i = 1;i<arr.length;i++){
           Node temp = new Node(arr[i]); 
        //   temp.next= arr[i+1];
           head.next = temp;
           head = head.next;
        }
        
        return p;
        
        
    }
}
