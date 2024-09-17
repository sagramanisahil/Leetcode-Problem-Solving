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
class SwappingNodes{
    public ListNode swapNodes(ListNode head, int k) {
        ListNode s = head;
        ListNode f = head;

        while(--k > 0){
            f = f.next;
        }

        ListNode first = f;
        while(f.next != null){
            s = s.next;
            f = f.next;
        }
        int curr = s.val;
        s.val = first.val;
        first.val = curr;

        return head;
    }
}