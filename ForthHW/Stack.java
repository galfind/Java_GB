package homework.ForthHW;

import java.util.LinkedList;

public class Stack {
    void first(LinkedList<Integer> l){
        System.out.println(l.getFirst());
    }
    void enqueue(LinkedList<Integer> l, int el){
        l.addLast(el);
    }
    void dequeue(LinkedList<Integer> l){
        System.out.println(l.removeFirst());
    }
}
