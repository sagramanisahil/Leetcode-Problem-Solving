class SwapNodes {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = slow.next;

        while(slow != null && fast != null){
            int temp = slow.val;
            slow.val = fast.val;
            fast.val = temp;

            if(fast != null){
                slow = fast.next;
            }
            if(slow != null){
                fast = slow.next;
            }
        }
        return head;
    }
}