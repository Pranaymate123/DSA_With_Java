package Tree_DataStructure;

public class Linked_List_In_Binary_Tree {

    static class ListNode
    {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
      if(root==null) return false;

      return check(root,head) || isSubPath(head,root.left) || isSubPath(head,root.right);
    }


    public boolean check(TreeNode root,ListNode head)
    {
        if(head==null) return true;

        if(head.val != root.val)
            return false;

        return check(root.left,head.next) || check(root.right,head.next);
    }
    public static void main(String[] args) {

    }
}
