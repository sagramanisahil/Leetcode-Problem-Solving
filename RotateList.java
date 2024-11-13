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
class RotateList{
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0){
            return head;
        }
        int length = 1;
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }
        k = k % length;

        if(k==0){
            return head;
        }
        curr.next = head;

        int stepsToTail = length - k - 1;
        ListNode newTail = head;

        for(int i=0; i<stepsToTail; i++){
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}