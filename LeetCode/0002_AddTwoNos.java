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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode q1 = l1;//reverse(l1);
        ListNode q2 = l2;//reverse(l2);
        ListNode prev = null;
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        int carry = 0;

        while(q1!= null || q2!= null){
            int sum = carry;
            if (q1 != null) {
                sum += q1.val;  // Add value from q1 if available
                q1 = q1.next;
            }

            if (q2 != null) {
                sum += q2.val;  // Add value from q2 if available
                q2 = q2.next;
            }

            carry = (sum>= 10)? 1:0;
            dummy.next  = new ListNode(sum%10);
            prev = dummy;
            dummy = dummy.next;
            
        }

        if(carry>0){
            dummy.next = new ListNode(carry);
        }

        return res.next;

    }
}
