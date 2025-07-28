package LinkedList;

public class Remove_Duplicates_From_Sorted_List {

   static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }



    public ListNode deleteDuplicates(ListNode head) {

         ListNode curr=head;
         while ( curr!=null && curr.next!=null)
         {
            if(curr.val == curr.next.val)
            {
               ListNode temp=curr.next;
               while (curr.val == temp.val)
               {
                  temp=temp.next;
               }
               curr.next=temp;
               curr=temp;
            }
            else
            {
               curr=curr.next;
            }
         }

         return head;
       
    }


    public static void main(String[] args) {

    }
}
