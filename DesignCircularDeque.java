class DesignCircularDeque {
    int arr[];
    int rear = 0;
    int front = 0;
    int count = 0;
    int size = 0;

    public MyCircularDeque(int k) {
        arr = new int[k];
        size = k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        else{
            front = (front - 1 + size) % size;
            arr[front] = value;
            count++;
            return true;
        }
    }
    
    public boolean insertLast(int value) {
         if(isFull()){
            return false;
        }
        else{
            arr[rear] = value;
            rear = (rear + 1) % size;
            count++;
            return true;
        }
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        else{
            front = (front+1) % size;
            count--;
            return true;
        }
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear = (rear - 1 + size) % size;
        count--;
        return true;
    }
    
    public int getFront() {
        if(!isEmpty()){
            return arr[front];
        } else {
            return -1;
        }
    }
    
    public int getRear() {
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
