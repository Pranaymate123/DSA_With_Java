package Tree_DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_Pruning {

    /*

  ####  Problem StateMent
    Given the root of a binary tree, return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

A subtree of a node node is node plus every node that is a descendant of node.
Example 1:


Input: root = [1,null,0,0,1]
Output: [1,null,0,null,1]
Explanation:
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.
Example 2:


Input: root = [1,0,1,0,0,0,1]
Output: [1,null,1,null,1]
Example 3:


Input: root = [1,1,0,1,1,0,1,0]
Output: [1,1,0,1,1,null,1]


Constraints:

The number of nodes in the tree is in the range [1, 200].
Node.val is either 0 or 1.



     */
    public static TreeNode pruneTree(TreeNode root) {
        solve(root);
        return root;
    }

    public static boolean solve(TreeNode root)
    {
        if(root==null) return false;

        boolean left=solve(root.left);

        boolean right=solve(root.right);

        if(!left){
            root.left=null;
        }

        if(!right)
        {
            root.right=null;
        }

        return (root.val==1 || left || right);
    }

    public static void levelOrderTraversal(TreeNode root)
    {
        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);
        TreeNode curr=null;
        while (!queue.isEmpty())
        {
            curr=queue.poll();

            System.out.print(curr.val+"  ");

            if(curr.left!=null)
            {
                queue.add(curr.left);
            }
            if(curr.right!=null)
            {
                queue.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(0);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(0);

        root.right=new TreeNode(1);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(1);

        root=  pruneTree(root);

        levelOrderTraversal(root);

    }
}
