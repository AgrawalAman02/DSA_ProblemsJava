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

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
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

    public ListNode middlell(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode fast = head.next;
        ListNode slow = head;
        
        while(fast!= null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if(head ==null || head.next == null) return head;

        ListNode middle = middlell(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;

        left = sortList(left);
        right = sortList(right);

        return merge(left,right);
    }
}
