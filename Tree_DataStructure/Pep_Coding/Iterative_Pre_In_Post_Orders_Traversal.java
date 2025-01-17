package Tree_DataStructure.Pep_Coding;

import com.sun.source.tree.WhileLoopTree;

import java.util.Stack;

public class Iterative_Pre_In_Post_Orders_Traversal {

    public static void iterativePreOrderTraversal(TreeNode root)
    {
        Stack<TreeNode> stk=new Stack<>();
        stk.push(root);
        TreeNode curr=null;
        while (!stk.isEmpty())
        {
            curr=stk.pop();
            System.out.print(curr.val+" ");
            //Go to right
            if(curr.right!=null)
            {
                stk.push(curr.right);
            }
            if(curr.left!=null)
            {
                stk.push(curr.left);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(25);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(37);
        root.left.right.left=new TreeNode(30);

        root.right=new TreeNode(75);
        root.right.left=new TreeNode(62);
        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        iterativePreOrderTraversal(root);
    }
}
