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
        if(head==null) return head;
        ListNode list = head;
        int length = 0;
        while(list!=null){
            list = list.next;
            length++;
        }

        if(k%length==0) return head;
        k = k%length;
        k = length-k;

        list = head;
        while(k>1){
            list = list.next;
            k--;
        }

        ListNode start = list.next;
        ListNode end = list;
        list = start;
        end.next = null;

        while(list.next!=null){
            list = list.next;
        }

        list.next = head;
        return start;
    }
}