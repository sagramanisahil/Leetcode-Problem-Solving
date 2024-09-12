class DesignCircularQueue {
    int arr[];
    int rear = 0;
    int front = 0;
    int count = 0;
    int size = 0;

    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        } else {
            arr[rear] = value;
            rear = (rear + 1) % size;
            count++;
        }
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            System.out.println("Nothing to delete in the queue");
            return false;
        } else {
            front = (front + 1) % size;
            count--;
        }
        return true;
    }
    
    public int Front() {
        if(!isEmpty()){
            return arr[front];
        } else {
            return -1;
        }
    }
    
    public int Rear() {
        if(!isEmpty()){
            return arr[(rear - 1 + size) % size];
        } else {
            return -1;
        }
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == size;
    }
}
