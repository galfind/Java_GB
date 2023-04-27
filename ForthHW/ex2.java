package homework.ForthHW;

import java.util.LinkedList;

public class ex2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        LinkedList<Integer> list = new LinkedList();
        stack.enqueue(list,5);
        stack.enqueue(list,6);
        stack.enqueue(list,7);
        stack.enqueue(list,8);
        stack.enqueue(list,9);
        System.out.println(list);
        stack.first(list);
        stack.dequeue(list);
        System.out.println(list);
    }
}
