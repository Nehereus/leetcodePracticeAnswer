class MyCircularQueue {
    int[] circle;
    int capacity;
    int head;
    int tail;
    int size;
    public MyCircularQueue(int k) {
        capacity = k;
        circle = new int[k];
        head = 0;
        tail = -1;
        size = 0;

    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            if(tail < capacity-1){tail++;}
            else{tail=0;}
            circle[tail] = value;
            size ++;
            return true;
        }else{return false;}
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            if (head < capacity-1){head++;}
            else{head = 0;}
            size--;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(isEmpty())
        return -1;
        return circle[head];
        
    }
    
    public int Rear() {
        if(isEmpty())
        return -1;
        return circle[tail];
        
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return (size==capacity);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */