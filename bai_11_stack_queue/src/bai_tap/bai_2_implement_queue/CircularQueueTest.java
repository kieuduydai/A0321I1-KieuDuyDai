package bai_tap.bai_2_implement_queue;

public class CircularQueueTest extends CircularQueue {
	public static void main(String[] args) {
        // Tạo một hàng đợi và khởi tạo front và rear
        Queue q = new Queue();
        q.front = q.rear = null;
        // Chèn các phần tử
        enQueue(q,14);
        enQueue(q,22);
        enQueue(q,6);
        // Display queue
        displayQueue(q);
        // Delete
        System.out.println("\ndelete value "+deQueue(q));
        // Phần tử sau khi xóa
        displayQueue(q);
        System.out.print("\n");
        enQueue(q,9);
        enQueue(q,20);
        displayQueue(q);
    }
}
