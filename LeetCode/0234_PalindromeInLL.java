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

    public ListNode reverse(ListNode head){
        ListNode tail = head;
        ListNode temp = head;
        ListNode front = null;

        while(temp!= null){
            tail  = temp.next;
            temp.next = front;
            front = temp;
            temp = tail;
        }
        return front;

    }
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            // It's a palindrome by definition
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next!= null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode nHead = reverse(slow.next);
        // reverse the second half
        
        ListNode temp = head;
        while(nHead!= null){
            if(temp.val == nHead.val){
                nHead = nHead.next;
                temp= temp.next;
            }
            else return false;
        }


        return true;
        // else return false;
    }
}
