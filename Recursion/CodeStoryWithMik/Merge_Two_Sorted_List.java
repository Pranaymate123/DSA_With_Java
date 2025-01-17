package Recursion.CodeStoryWithMik;

class ListNode {
    int data;
    ListNode next;
}
public class Merge_Two_Sorted_List {

    public static ListNode mergeSortedList(ListNode L1,ListNode L2)
    {

        if(L1==null)
        {
            return L2;
        }
        if(L2==null)
        {
            return L1;
        }
        ListNode result;
        if(L1.data<L2.data)
        {
            result=L1;
            result.next=mergeSortedList(L1.next,L2);
        }else
        {
            result=L2;
           result.next= mergeSortedList(L1,L2.next);
        }

        return result;

    }

    public static void main(String[] args) {

    }
}
