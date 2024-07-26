class RemoveNode{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size = 0;
        ListNode current = head;
        while(current != null){
            current = current.next;
            size++;
        }

        if(n == size){
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while(i < indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
  
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        RemoveNode solution = new RemoveNode();
        head = solution.removeNthFromEnd(head, 2);

        System.out.print("Updated List: ");
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
