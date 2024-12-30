class ConvertBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        return Convert(head, null);
    }
    public TreeNode Convert(ListNode head, ListNode tail){
        if(head == tail){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode tree = new TreeNode(slow.val);
        tree.left = Convert(head, slow);
        tree.right = Convert(slow.next, tail);
        return tree;
    }
}