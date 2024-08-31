class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null && head.next == null){
            return true;
        }
        ListNode start = head;
        ListNode end = head;
        while(end != null && end.next != null){
            start = start.next;
            end = end.next.next;
        }
        ListNode pre = null;
        while(start != null){
            ListNode nextNode = start.next;
            start.next = pre;
            pre = start;
            start = nextNode;
        }

        ListNode l = head;
        ListNode r = pre;

        while( r != null ){
            if(l.val != r.val){
                return false;
            }
            l = l.next;
            r = r.next;
        }
        return true;
    }
}