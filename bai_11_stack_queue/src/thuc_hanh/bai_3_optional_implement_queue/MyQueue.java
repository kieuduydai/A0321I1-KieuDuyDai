package thuc_hanh.bai_3_optional_implement_queue;

public class MyQueue {
	private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    
    // kiểm tra đã full chưa
    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity+1){
            status = true;
        }
        return status;
    }
    
    // kiểm tra có rỗng không
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
    
    // thêm giá trị vào queue
    public void enqueue(int value) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + value);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = value;
            currentSize++;
            System.out.println("Element " + value + " is pushed to Queue !");
        }
    }
    
    // First in, Firt out
    public void dequeue() {
        if (isQueueEmpty()) {
        	System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
    
}
