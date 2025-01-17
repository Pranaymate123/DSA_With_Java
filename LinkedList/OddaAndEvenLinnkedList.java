package LinkedList;


import java.util.Scanner;

public class OddaAndEvenLinnkedList {
    public static Node head=null;

//    Problem Solution
    public static Node segregateOddAndEvenIndex(Node head)
    {
        if(head==null || head.next==null) return head;
        Node odd=head;
        Node even=head.next;
        Node evenHead=even;

        while (even!=null && even.next!=null )
        {
                odd.next=odd.next.next;

                even.next=even.next.next;

                odd=odd.next;

                even=even.next;

        }

        odd.next=evenHead;
        return head;
    }

    public static void insertNode()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data ");
        int data=sc.nextInt();
        if(head==null)
        {
            head=new Node(data,null);
        }
        else {
            Node curr=head;
            while (curr.getNext()!=null)
            {
                curr=curr.getNext();
            }
            Node newNode =new Node(data,null);
            curr.setNext(newNode);
        }
    }

    public static void display(Node head)
    {
        Node curr=head;
        while (curr!=null)
        {
            System.out.print(" | " + curr.getData()+" | "+curr.getNext()+" |-----> ");
            curr=curr.getNext();
        }
    }

    public static void main(String[] args) {
        insertNode();
        insertNode();
        insertNode();
        insertNode();
        insertNode();

        display(head);

        head=segregateOddAndEvenIndex(head);
        System.out.println("------------------------------");
        display(head);

    }


}
