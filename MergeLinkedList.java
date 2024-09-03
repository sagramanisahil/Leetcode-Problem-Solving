class MergeLinkedList{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1);
        ListNode temp = list3;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
               temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        if(list2 != null){
            temp.next = list2;
        }
        return list3.next;
    }
}