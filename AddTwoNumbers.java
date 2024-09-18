class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0; 
            int digit2 = (l2 != null) ? l2.val : 0; 

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
 
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        return dummy.next;
    }
}
