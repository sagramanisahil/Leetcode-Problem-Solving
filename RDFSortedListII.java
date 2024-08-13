class RFDSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode curr = head;

        while(curr != null) {
            while(curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }
            if(pre.next == curr) {
                pre = pre.next;
            } else {
                pre.next = curr.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}