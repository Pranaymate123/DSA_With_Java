package Tree_DataStructure.Pep_Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LCA_Of_Binary_Tree {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null) return null;
        if(root==p || root == q)
        {
            return root;
        }
        TreeNode leftFind=lowestCommonAncestor(root.left,p,q);
        TreeNode rightFind=lowestCommonAncestor(root.right,p,q);

        if(leftFind!=null && rightFind !=null)
        {
            return root;
        }

        if(leftFind!=null) return leftFind;

       return rightFind;

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

        System.out.println(lowestCommonAncestor(root, root.left.right.left,root.right.left.right).val);
    }
}
