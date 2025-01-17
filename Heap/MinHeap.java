package Heap;

import java.util.PriorityQueue;

class Pair{
    String name;
    int key;

    public Pair(String name, int key) {
        this.name = name;
        this.key = key;
    }
}
public class MinHeap {

    public static void HeapForPairs()
    {
        PriorityQueue<Pair> minHeap=new PriorityQueue<>((a,b)->a.key-b.key);

        minHeap.add(new Pair("Pranay",37));
        minHeap.add(new Pair("Rhutam",35));
        minHeap.add(new Pair("Devesh",38));
        minHeap.add(new Pair("Netra",42));

        System.out.println(minHeap.poll().key);
        System.out.println(minHeap.poll().key);
        System.out.println(minHeap.poll().key);
        System.out.println(minHeap.poll().key);
    }

    public static void main(String[] args) {

        //By default the priority queue is like the minHeap
//        PriorityQueue<Integer> maxHeap =new PriorityQueue<>();
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
