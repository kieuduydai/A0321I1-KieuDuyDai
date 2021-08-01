package thuc_hanh.bai_2_basic_linkedlist;

public class MyLinkedListTest {
	public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(2);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(0,0);
        ll.add(4,9);
        ll.printList();
    }
}
