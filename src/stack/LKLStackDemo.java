
package stack;

public class LKLStackDemo {
    public static void main(String[] args) {
        LinkedListStack<Integer> list = new LinkedListStack<>();
        list.push(50);
        list.push(20);
        list.push(30);
        list.push(10);
        System.out.println("---------");
        list.show();
        
        System.out.println("sdad " + list.pop());
        list.show();        
        System.out.println("sdad " + list.pop());
        list.show();
        
    }
}
