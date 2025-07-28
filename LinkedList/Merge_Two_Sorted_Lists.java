package LinkedList;

public class Merge_Two_Sorted_Lists {

    public Node mergeTwoLists(Node head1, Node head2) {

        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head1;
        }
        if(head1.data <=head2.data)
        {
            head1.next=mergeTwoLists(head1.next,head2);
            return head1;
        }
        else
        {
            head2.next=mergeTwoLists(head1,head2.next);
            return head2;
        }

    }
    public static void main(String[] args) {

    }
}
