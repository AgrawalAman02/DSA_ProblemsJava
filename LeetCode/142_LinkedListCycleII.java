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
    }
}
