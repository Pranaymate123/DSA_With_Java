package LinkedList;

public class Detect_Cycle_II {

    public static Node findCycle(Node head) {
        // code here
       Node slow=head;
       Node fast=head;

       while (fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
             return removeCycle(fast,head);

           }
       }
return null;

    }

    public static Node removeCycle(Node loopNode ,Node head)
    {
        Node slow=head;
        Node fast=loopNode;

        //Finding the start node of the loop
        while (slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }

        return fast;
    }
    public static void main(String[] args) {

    }
}
