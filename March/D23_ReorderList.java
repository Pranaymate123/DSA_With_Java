package March;

import java.util.HashMap;
import java.util.Stack;

public class D23_ReorderList {
    public static void reorderList(ListNode head) {
        Stack<ListNode> stk=new Stack<>();
        HashMap<ListNode,Boolean> map=new HashMap();
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=slow.next;
        while (slow!=null)
        {
            map.put(slow,true);
            stk.push(slow);
            slow=slow.next;
        }

        ListNode curr=head;
        while (!stk.isEmpty())
        {
            System.out.println("check ");
            ListNode temp=curr.next;
            curr.next=stk.pop();
            if(!map.containsKey(temp))
                curr.next.next=temp;
            else
                curr.next.next=null;
            curr=temp;
        }
        curr.next=null;

    }

    public static void displayList(ListNode head)
    {
        ListNode curr=head;
        while (curr!=null)
        {
            System.out.print("|"+curr.val+"|--->");
            curr=curr.next;
        }
    }


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        reorderList(head);

        displayList(head);

    }
}
