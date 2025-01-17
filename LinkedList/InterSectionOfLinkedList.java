package LinkedList;

import java.util.Scanner;

public class InterSectionOfLinkedList {

    public  Node head=null;

    public  void insertNode()
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

    public void display(Node head)
    {
        Node curr=head;
        while (curr!=null)
        {
            System.out.print(" | " + curr.getData()+" | "+curr.getNext()+" |-----> ");
            curr=curr.getNext();
        }
    }

    public static Node findIntersection(Node  head1,Node  head2)
    {
        if(head1==null || head2==null)
        {
            return null;
        }
        Node t1=head1;
        Node t2=head2;
        while (t1!=t2)
        {
            t1=t1.next;
            t2=t2.next;

            if(t1==t2) return t1;

            if(t1==null)
            {
                t1=head2;
            }
            if(t2==null)
            {
                t2=head1;
            }
        }
        return t1;
    }


    public static void main(String[] args) {

        InterSectionOfLinkedList obj1=new InterSectionOfLinkedList();
        InterSectionOfLinkedList obj2=new InterSectionOfLinkedList();


    }
}
