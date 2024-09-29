/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while(temp!= null){
            temp = temp.next;
            len++;
        }
        if(len == 1) return null;
        int n = len/2;

        temp = head;
        int i = 0;
        while(i<n-1){
            temp = temp.next;
            i++;
        }
        if(temp.next != null && temp != null)
            temp.next = temp.next.next;
        
        return head;
    }
}

// we can even use the slow and fast node to find the mddle ans then remove it 
