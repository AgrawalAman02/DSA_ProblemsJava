/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // HashSet<ListNode> hs = new HashSet<>();    // using O(n1) /O(n2) space complexity;
        // if(headA == null && headB == null) return null;
        // if(headA == null) return headB;
        // if(headB == null ) return headA;
        // ListNode tempA = headA;
        // ListNode tempB = headB;

        // while(tempA != null) {
        //     hs.add(tempA);
        //     tempA = tempA.next;
        // }

        // while(tempB != null){
        //     if(hs.contains(tempB)) return tempB;
        //     else{
        //         tempB= tempB.next;
        //     }
        // }
        // return tempB;

        // using O(1) space complexity

        int s1= 0;
        int s2 = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        while(tempA != null) {
            s1++;
            tempA = tempA.next;
        }

        while(tempB != null){
            s2++;
            tempB= tempB.next;
        }
        tempA = headA;
        tempB = headB;

        while(s1>s2){
            s1--;
            tempA = tempA.next;
        }
        while(s1<s2){
            s2--;
            tempB = tempB.next;
        }

        while(tempA != tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
