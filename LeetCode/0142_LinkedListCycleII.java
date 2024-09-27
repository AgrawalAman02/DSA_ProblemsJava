/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        // using the extra space
        HashSet<ListNode> mp = new HashSet<>();
        ListNode temp = head;
        while(temp!= null){
            if(mp.contains(temp)) return temp;
            else{
                mp.add(temp);
                temp = temp.next;
            }
        }
        return null;

        // optimised using the two ptr approach so that space comp = O(1)

        ListNode slow = head;
        ListNode fast =head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast ){
                slow = head;
                while(slow!=fast){
                    fast  = fast.next;
                    slow = slow.next;
                }
                return slow;

            }
        }

        
        return null;


        
    }
}
