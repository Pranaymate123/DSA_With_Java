package LinkedList;

import java.util.Scanner;

public class Sort0s1sAnd2s {

    public static Node head=null;
    //    Problem Solution
    public static Node sort0s1sand2s(Node head)
    {
        if(head==null || head.next==null) return head;

        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);

        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;

        Node temp=head;
        while (temp!=null)
        {
            if(temp.data==0)
            {
                zero.next=temp;
                zero=zero.next;
            } else if (temp.data==1) {
                one.next=temp;
                one=one.next;
            }
            else {
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;

        }

        zero.next=oneHead.next!=null ? oneHead.next : twoHead.next;
        one.next=twoHead.next;
        two.next=null;

        return zeroHead.next;

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
        insertNode();

        display(head);

        head=sort0s1sand2s(head);
        System.out.println("------------------------------");
        display(head);

    }

}

