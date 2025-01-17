package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class doublyNode{
    public int data;
    public doublyNode prev;
    public doublyNode next;

    public doublyNode(int data, doublyNode prev, doublyNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public doublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList {

    public static doublyNode head;
    public static doublyNode insertLast(int data)
    {
        doublyNode newNode=new doublyNode(data);
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            doublyNode curr=head;
            while (curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next=newNode;
            newNode.prev=curr;
        }
        return head;
    }

    public static void display(doublyNode head)
    {
        doublyNode curr=head;
        while (curr!=null)
        {
            System.out.print(" | "+curr.prev+ " | "+curr.data+" | "+curr.next+" |----->");
            curr=curr.next;
        }
    }

    public static doublyNode removeFirst(doublyNode head)
    {
        if(head==null) return null;
        head=head.next;
        head.prev=null;
        return head;
    }
    public static doublyNode removeLast(doublyNode head)
    {
        if(head==null) return null;
        doublyNode curr=head;
        while (curr.next.next!=null)
        {
            curr=curr.next;
        }
        curr.next.prev=null;
        curr.next=null;
        return head;
    }
    public static doublyNode removeKthElement(doublyNode head,int k)
    {
         if(head==null) return null;
         if(k==1)
         {
             head=head.next;
             head.prev=null;
             return head;
         }
         else {
             int cnt=1;
             doublyNode curr=head;
             while (cnt<k-1)
             {
                 curr=curr.next;
                 cnt++;
             }
             doublyNode temp=curr.next;
             curr.next=temp.next;
             temp.next.prev=curr;
             temp.next=null;
             temp.prev=null;

         }
         return head;
    }

    public static doublyNode insertFirst(doublyNode head,int val)
    {
        doublyNode newNode=new doublyNode(val);
        if(head==null)
        {
             head=newNode;
             return head;
        }
        else {
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        return head;
    }

    public static doublyNode insertAtKthLocation(doublyNode head,int data, int k)
    {
        doublyNode newNode=new doublyNode(data);

        if(head==null)
        {
            head=newNode;
            return head;
        }
        else if(k==1){
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
        else {
            doublyNode curr=head;
            int cnt=1;
            while (cnt<k-1)
            {
                curr=curr.next;
                cnt++;
            }
            doublyNode temp=curr.next;
            curr.next=newNode;
            newNode.prev=curr;
            newNode.next=temp;
            temp.prev=newNode;

        }
        return head;
    }

    public static doublyNode reverseList(doublyNode head)
    {
        doublyNode curr=head;
        doublyNode prev=null;
        while (curr!=null)
        {
            prev=curr.prev;
            curr.prev=curr.next;
            curr.next=prev;
            curr=curr.prev;
        }
        return prev.prev;
    }
    public static ArrayList<ArrayList<Integer>> getPairsOfSum(doublyNode head,int target)
    {
        doublyNode left=head;
        doublyNode right=head;
        ArrayList<ArrayList<Integer>> ans=new ArrayList();

        while(right.next!=null)
        {
            right=right.next;
        }
        while(left.data<right.data)
        {
            int sum=left.data+right.data;
            if(sum>target)
            {
                right=right.prev;
            }
            else if(sum<target)
            {
                left=left.next;
            }
            else
            {

                ans.add(new ArrayList<>(Arrays.asList(left.data,right.data)));

                left=left.next;
                right=right.prev;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the choice \n1 for insert \n2 for display \n3 for removeHead\n4 removeLast\n5 Remove Kth Element\n6 Insert First\n7 Insert At Kth Location\n8 reverse List");
            System.out.println("9 Find Pairs with given sum");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter the data to insert ");
                int data=sc.nextInt();
                head=insertLast(data);

            } else if (ch==2)
            {
                display(head);
            } else if (ch==3) {
                head=removeFirst(head);
            } else if (ch==4) {
                head=removeLast(head);
            } else if (ch==5) {
                System.out.println("Enter the location of the node to delete");
                int k=sc.nextInt();
                head=removeKthElement(head,k);

            } else if (ch==6) {
                System.out.println("Enter the data ");
                int data=sc.nextInt();
                head=insertFirst(head,data);


            } else if (ch==7) {
                System.out.println("Enter the data and location to insert the node ");
                int val=sc.nextInt();
                int k=sc.nextInt();
                head=insertAtKthLocation(head,val,k);
            }
            else if(ch==8)
            {
                head=reverseList(head);
            } else if (ch==9) {

                System.out.println(getPairsOfSum(head,5));

            }
            System.out.println("To Continue Press 1 ");
        }while (sc.next().equals("1"));
    }
    }


