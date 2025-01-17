package LinkedList;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    class Pair{
        int data;
        Node node;

        public Pair(int data, Node node) {
            this.data = data;
            this.node = node;
        }
    }
    public Node mergeKLists(Node[] lists) {

        //min-heap
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0;i<lists.length;i++)
        {
            pq.add(new Pair(lists[i].data,lists[i]));
        }

        Node dummyHead=new Node (-1);

        Node temp=dummyHead;

        while(!pq.isEmpty())
        {
            Pair p=pq.peek();
            temp.next=p.node;

            pq.remove();

            if(p.node.next!=null)
            {
                pq.add(new Pair(p.node.next.data,p.node.next));
                temp=temp.next;
            }
        }
        return dummyHead.next;
    }
}
