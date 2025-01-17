package LinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

class Node{
    public   int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
public class LinkedListExample {

    public static Node head=null;

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

    public static Node removeHead(Node head)
    {
        if(head==null) return null;
        head=head.getNext();
        return head;
    }

    public static Node removeLast(Node head)
    {
        if(head==null) return null;
        Node curr=head;
        while (curr.getNext().getNext()!=null)
        {
            curr=curr.getNext();
        }
        curr.setNext(null);
        return head;
    }

    public static Node removeKthElement(Node head, int k)
    {
        if(head==null) return null;

        if (k==1)
        {
            head=head.getNext();
            return head;
        }
        else
        {
            Node curr=head;
            for(int i=0;i<k-2;i++)
            {
                curr=curr.getNext();
            }
            Node temp=curr.getNext().getNext();
            curr.setNext(temp);
        }
        return head;
    }
    public static Node insertFirst(int val)
    {
        Node newNode=new Node(val,null);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
    public static Node insertAtKthLocation(Node head,int val,int k)
    {
        Node newNode=new Node(val,null);
        if(head==null)
        {
            head=newNode;
        }
        else {
            if (k == 1){
                newNode.next=head;
                head=newNode;
            }
            Node curr=head;
            int cnt=1;
            while (cnt<k-1)
            {
                curr=curr.next;
                cnt++;
            }
            Node temp=curr.next;
            curr.next=newNode;
            newNode.next=temp;
        }
        return head;
    }

    public static Node removeKthElementFromLast(Node head,int k)
    {
        if(head==null) return null;
        Node fast=head;
        Node slow=head;
        while (k!=0)
        {
            k--;
            if(k==0) break;
            fast=fast.next;
        }
        if(fast.next==null) return head.next;
        while (fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static Node reverseList(Node head)
    {
        Node temp=head;
        Node prev=null;
        Node front=null;
        while (temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static Node reverseListByRecursion(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node newHead=reverseListByRecursion(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

    public static boolean checkPalindrome(Node head)
    {
        if(head==null || head.next==null) return true;
        Node slow=head;
        Node fast=head;

        while (fast.next !=null && fast.next.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newHead=reverseList(slow.next);
        Node first=head;
        Node second=newHead;

        while (second!=null)
        {
            if(first.data != second.data)
            {
                reverseList(newHead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverseList(newHead);
        return true;
    }

    public static Node addOne(Node head)
    {
        if(head==null) return null;

        int carry=helper(head);

        if(carry==1)
        {
            Node newNode=new Node(1);
            newNode.next=head;
            head=newNode;
            return head;
        }
        return head;

    }

    public static int helper(Node temp)
    {
        if(temp==null)
        {
            //base case
            return 1;
        }
        int carry=helper(temp.next);

        temp.data=temp.data+carry;
        if(temp.data < 10)
        {
            return 0;
        }
        temp.data=0;

        return 1;
    }

    public static Node getMiddleNode(Node head)
    {
        if(head==null || head.next==null) return head;
        Node fast=head;
        Node slow=head;
        while ( fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }

            return slow;

    }
    public static Node deleteMiddle(Node head)
    {
        if(head==null || head.next==null) return head;
        Node fast=head;
        Node slow=head;
        Node prev=null;
        while ( fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        //middle
//        return slow;
        prev.next=slow.next;
        return head;

    }

    public static boolean checkPalindromWithStack(Node head)
    {
        Stack<Integer> stk=new Stack<>();
        Node temp=head;
        while(temp!=null)
        {
            stk.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null)
        {
            if(temp.data!=stk.pop())
            {
                return false;
            }
            temp=temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       do{
           System.out.println("Enter the choice \n1 for insert \n2 for display \n3 for removeHead\n4 removeLast\n5 Remove Kth Element\n6 Insert First\n7 Insert At Kth Location\n8 Remove the kth element from last\n9 Reverse the List ");
           System.out.println("10 Reverse By Recursion\n11 check Palindrome\n12 add One\n13 get Middle Node\n14 delete Middle");
           int ch=sc.nextInt();
           if(ch==1)
           {
               insertNode();
           } else if (ch==2)
           {
               display(head);
           } else if (ch==3) {
               head=removeHead(head);
           } else if (ch==4) {
               head=removeLast(head);
           } else if (ch==5) {
               System.out.println("Enter the location of the node to delete");
               int k=sc.nextInt();
               head=removeKthElement(head,k);
           } else if (ch==6) {
               System.out.println("Enter the data ");
               int data=sc.nextInt();
               head=insertFirst(data);

           } else if (ch==7) {
               System.out.println("Enter the data and location to insert the node ");
               int val=sc.nextInt();
               int k=sc.nextInt();
               head=insertAtKthLocation(head,val,k);
           } else if (ch==8) {
               System.out.println("Enter the Kth Node from Last : ");
               int k=sc.nextInt();
               head=removeKthElementFromLast(head,k);

           } else if (ch==9) {
                head=reverseList(head);
           } else if (ch==10) {
               head=reverseListByRecursion(head);

           } else if (ch==11) {
               System.out.println(checkPalindrome(head));
               System.out.println(checkPalindromWithStack(head));
           } else if (ch==12) {
               head=addOne(head);

           } else if (ch==13) {
               Node temp=head;
               System.out.println("Middle Node is --> "+ getMiddleNode(temp).data);
           } else if (ch==14) {
                head=deleteMiddle(head);
           }
           System.out.println("To Continue Press 1 ");
       }while (sc.next().equals("1"));
    }

}
