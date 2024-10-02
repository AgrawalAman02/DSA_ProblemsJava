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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ) return head;
        int n = 0;

        ListNode temp = head;

        while(temp!= null){
            n++;
            temp = temp.next;
        }

        // temp = head;

        k = k%n;
        if(k==0) return head;
        ListNode next = null;
        ListNode slow = head;
        ListNode fast  = head;

        int i=0;
        while(i<k){
            fast = fast.next;
            i++;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        next = slow.next;
        slow.next = null;
        fast.next = head;
        head = next;

        return head;
    }
}

// we can also do by making the list circular
