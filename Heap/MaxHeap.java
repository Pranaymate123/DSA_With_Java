package Heap;

import java.util.PriorityQueue;

public class MaxHeap {

    public static void HeapForPairs()
    {
        PriorityQueue<Pair> maxHeap=new PriorityQueue<>((a,b)->b.key-a.key);

        maxHeap.add(new Pair("Pranay",37));
        maxHeap.add(new Pair("Rhutam",35));
        maxHeap.add(new Pair("Devesh",38));
        maxHeap.add(new Pair("Netra",42));

        System.out.println(maxHeap.poll().key);
        System.out.println(maxHeap.poll().key);
        System.out.println(maxHeap.poll().key);
        System.out.println(maxHeap.poll().key);
    }
    public static void main(String[] args) {

//        PriorityQueue<Integer> maxHeap =new PriorityQueue<>((a,b)->b-a);
//
//        maxHeap.add(7);
//        maxHeap.add(10);
//        maxHeap.add(4);
//        maxHeap.add(3);
//        maxHeap.add(20);
//        maxHeap.add(15);
//
//        System.out.println(maxHeap);
//
//        System.out.println(maxHeap.peek());
////        System.out.println(maxHeap.poll());
//        System.out.println(maxHeap.remove());
        HeapForPairs();
    }
}
