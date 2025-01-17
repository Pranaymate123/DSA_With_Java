package Queue;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
public class QueueWithLinkedList {

    public static Node front;
    public static Node rear;

    public static boolean isEmpty()
    {
        return front==null && rear==null;
    }

    public static void add(int data)
    {
        Node newNode=new Node(data);
        if(front==null)
        {
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    public static int remove()
    {
        if(isEmpty())
        {
            return -1;
        }

            int data=front.data;
            if(front==rear)
            {
                front=null;
                rear=null;
            }
            else
                front=front.next;

            return data;
    }


    public static void displayQue(Node head)
    {
        if(isEmpty())
        {
            System.out.println("Queue Is Empty ");
            return;
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(" | "+temp.data+" | "+temp.next+" | ---->");
            temp=temp.next;
        }
    }

    public static int peek()
    {
        if(isEmpty())
        {
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1 For Add\n2 Remove \n3 For Peek \n4 for display");
            ch= sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter the data");
                int data=sc.nextInt();
                add(data);
            } else if (ch==2) {
                System.out.println(remove());

            } else if (ch==3) {

                System.out.println(peek());

            } else if(ch==4)
            {
                displayQue(front);
            }
            System.out.println("To Continue Press 1 ");
        }while (sc.next().equals("1"));
    }
}
