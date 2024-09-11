public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) { 
            return false; 
        } 
        ListNode start = head; 
        ListNode end = head.next; 
 
        while (end != null && end.next != null) { 
            if (start == end) { 
                return true; 
            } 
            start = start.next;
            end = end.next.next; 
        } 
        return false;
    }
}