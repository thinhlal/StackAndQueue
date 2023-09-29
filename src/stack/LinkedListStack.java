package stack;

public class LinkedListStack<E> implements IStack<E> {

    private class Node<E> {

        E value;
        Node next;

        public Node(E value) {
            this.value = value;
        }
    }

    Node topNode;
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
    public boolean push(E item) {
        Node newNode = new Node(item);
        if (topNode == null) {
            topNode = newNode;
        }else{
            newNode.next = topNode;
            topNode = newNode;
            ++n;
        }
        return true;
    }

    @Override
    public E pop() {
        if (!isEmpty()) {
            E value = (E) topNode.value;
            topNode = topNode.next;
            n--;
            return value;
        }
        return null;
    }

    @Override
    public E top() {
        if (isEmpty()) {
            return null;
        }
        return (E) topNode.value;
    }

    public void show() {
        Node newNode = topNode;
        while (newNode != null) {
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }
}
