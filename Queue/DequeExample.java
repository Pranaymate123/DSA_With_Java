package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(2);
        deque.addLast(1);

        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
