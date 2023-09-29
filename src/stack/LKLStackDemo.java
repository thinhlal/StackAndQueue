
package stack;

public class LKLStackDemo {
    public static void main(String[] args) {
        LinkedListStack<Integer> list = new LinkedListStack<>();
        
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        System.out.println(list.pop());
        list.show();
    }
}
