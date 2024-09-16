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
class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;

        while(curr != null){
            ListNode prev = dummy;

            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }
            ListNode temp = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = temp;
        }
        return dummy.next;
    }
}