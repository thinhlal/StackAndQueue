package queue1;



public class LinkedListQueueDemo {

    public static void main(String[] args) {
        LinkedListQueue<Integer> list = new LinkedListQueue<>();
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        System.out.println(list.dequeue());
        list.show();
    }
}
