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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode front = null;
        ListNode back = null;
        ListNode temp = head;

        while(temp != null){
            front = temp.next;
            temp.next = back;
            back = temp;
            temp = front;
        }
        head = back;
        return head;
    }
}
