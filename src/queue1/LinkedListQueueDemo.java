package queue1;



public class LinkedListQueueDemo {

    public static void main(String[] args) {
        LinkedListQueue<Integer> list = new LinkedListQueue<>();
        Integer deq = list.dequeue();
        System.out.println(deq);
        System.out.println("-----------");
        System.out.println(list.isEmpty());
        list.show();
    }
}
