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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = null;

        int i = 1;
        while(i<=n&& fast!= null){
            fast = fast.next;
            i++;
        }

        while(fast!= null){
            fast = fast.next;
            temp = slow;
            slow= slow.next;
        }

        if(temp == null) head = head = head.next;
        else{
            temp.next = slow.next;
        }

        return head;
    }
}
