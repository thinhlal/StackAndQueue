package queue1;

public class LinkedListQueue<E> implements IQueue<E> {

    private class Node<E> {

        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    Node front, rear;
    int n;

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean enqueue(E item) {
        Node newNode = new Node(item);
        if (this.front == null || this.rear == null) {
            this.rear = this.front = newNode;
            n++;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
            n++;
        }
        return true;
    }

    @Override
    public E dequeue() {
        if (front == null) {
            this.rear = null;
            return null;
        }
        E value = (E) this.front.value;
        this.front = this.front.next;
        n--;
        return value;
    }

    @Override
    public E first() {
        if (!isEmpty()) {
            return (E) this.front.value;
        }
        return null;
    }

    public void show() {
        Node newNode = front;
        while (newNode != null) {
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }
}
