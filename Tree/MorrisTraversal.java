package Tree;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversal {
    public static List<Integer> inorderMorrisTraversal(TreeNode root)
    {
        List<Integer> inorder=new ArrayList<>();

        TreeNode curr=root;
        while (curr!=null)
        {
            if(curr.left==null)
            {
                inorder.add(curr.val);
                curr=curr.right;
            }
            else {
               TreeNode prev=curr.left;
                while (prev.right!=null && prev.right!=curr )
                {
                    prev=prev.right;
                }
                if(prev.right==null)
                {
                    prev.right=curr;
                    curr=curr.left;
                }
                else
                {
                    inorder.add(curr.val);
                    curr=curr.right;
                    prev.right=null;
                }
            }
        }
        return inorder;
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(3);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.right=new TreeNode(6);

        System.out.println(inorderMorrisTraversal(root));

    }
}
