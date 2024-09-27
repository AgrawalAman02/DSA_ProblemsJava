//{ Driver Code Starts

// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        
        if(head == null) return 0;
        // int len = 0;
        Node slow = head;
        Node fast = head;
        
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            // len++;
            
            if(slow == fast ){
                // return len;
                slow = head;
                
                
                while(slow!= fast ){
                    slow = slow.next;
                    fast = fast.next;
                    // len++;
                }
                int len = 1;
                fast = fast.next;
                while(fast!= slow){
                    fast = fast.next;
                    len++;
                }
                
                return len;
                
            }
        }
        
        return 0;
    }
}
