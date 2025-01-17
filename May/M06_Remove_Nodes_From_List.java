package May;




public class M06_Remove_Nodes_From_List {

    static  class Node {
        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
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

    public static Node removeNodes(Node head) {
        head=reverseList(head);
        int max=head.data;
        Node curr=head;
        while (curr!=null)
        {
            if(curr.next.data<max)
            {
                Node temp=curr.next;
                curr.next=temp.next;
                temp.next=null;
            }
        }
        head=reverseList(head);
        return head;
    }
    public static void main(String[] args) {

    }


}
