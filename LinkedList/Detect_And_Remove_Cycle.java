package LinkedList;

public class Detect_And_Remove_Cycle {

    public static void removeCycle(Node head) {
        // code here
        Node slow=head;
        Node fast=head;

        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                 removeCycle(fast,head);
                 break;

            }
        }


    }

    public static void removeCycle(Node loopNode ,Node head)
    {
        Node slow=head;
        Node fast=loopNode;

        //Finding the start node of the loop
        Node prev=fast;
        while (slow!=fast)
        {
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        prev.next=null;
//        return fast;
    }

    public static void main(String[] args) {

    }
}
