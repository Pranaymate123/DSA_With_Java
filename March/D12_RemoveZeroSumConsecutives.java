package March;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListNode
{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val=val;
        this.next=null;
    }
}
public class D12_RemoveZeroSumConsecutives {

    public static ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummyHead=new ListNode(-1);
        dummyHead.next=head;
        Map<Integer, ListNode> map=new HashMap<>();
        map.put(0,dummyHead);
        ListNode curr=head;
        int prefixSum=0;
        while (curr!=null)
        {
            prefixSum+=curr.val;
            if(!map.containsKey(prefixSum))
            {
                map.put(prefixSum,curr);
            }
            else
            {
                ListNode start=map.get(prefixSum);
                ListNode temp=start.next;
                int remove=prefixSum;
                while (temp!=curr)
                {
                    remove=remove+temp.val;
                    map.remove(remove);
                    temp=temp.next;
                }
                start.next=curr.next;

            }
            curr=curr.next;
        }
        return dummyHead.next;
    }

    public static void displayList(ListNode head)
    {
        ListNode curr=head;
        while (curr!=null)
        {
            System.out.print("|"+curr.val+"||--->");
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(3);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(-3);
        head.next.next.next.next=new ListNode(-2);
        head.next.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next.next.next=new ListNode(-5);
        head.next.next.next.next.next.next.next.next=new ListNode(1);

        displayList(head);
        head=removeZeroSumSublists(head);

        System.out.println("-------------------------------------------------------");
        displayList(head);

//        1,3,2,-3,-2,5,5,-5,1

//        [1,5,5,-5,1]

//        [1,5,1]
    }
}
