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
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp;

        while(curr!= null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public int size(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(temp!= null){
            temp = temp.next;
            n++;
        }
        return n;
    }

    public ListNode findkNode(ListNode head,int k){
        int i = 1;
        while(i<k && head.next!= null){
            head = head.next;
            i++;
            
        }
        if(i==k)
        return head;
        else return null;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==0 || head == null|| head.next == null) return head;
        int n = size(head);
        ListNode temp = head, prev = null, kNode = null;
        ListNode nex = null;

        while(temp!= null){
            kNode = findkNode(temp,k);
            if(kNode == null){
                prev.next = temp;
                break;
            }
            nex = kNode.next;
            kNode.next = null;
            kNode = reverse(temp);
            if(temp == head){
                head = kNode;
            }else{
                prev.next = kNode;
            }
            prev = temp;
            temp = nex;
        }
        return head;
    }
}
