class DesignLinkedList {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public MyLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        int count = 0;
        Node curr = head;

        while (curr != null) {
            if (count == index) {
                return curr.val;
            }
            count++;
            curr = curr.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) { 
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node newNode = new Node(val);
        Node curr = head;
        int count = 0;

        while (curr != null && count < index - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null) {
            return;
        }

        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) { 
            head = head.next;
            return;
        }

        Node curr = head;
        int count = 0;

        while (curr != null && count < index - 1) {
            curr = curr.next;
            count++;
        }

        if (curr == null || curr.next == null) {
            return;
        }

        curr.next = curr.next.next; 
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index, val);
 * obj.deleteAtIndex(index);
 */
