package Tree.BST;

import java.util.ArrayList;
import java.util.List;

public class PredecessorSuccessor {

    public static TreeNode findPredecessor(TreeNode root,int key)
    {
        TreeNode predecesor=null;
        while (root!=null)
        {
            if(key > root.val)
            {
                predecesor=root;
                root=root.right;
            }
            else
            {

                root=root.left;
            }
        }
        return predecesor;
    }
    public static TreeNode findSuccesor(TreeNode root,int key)
    {
        TreeNode successor=null;
        while (root!=null)
        {
            if(key >= root.val)
            {
                root=root.right;
            }
            else
            {
                successor=root;
                root=root.left;
            }
        }
        return successor;
    }

    public static List<Integer> predecessorSuccessor(TreeNode root, int key) {
        List<Integer> ans=new ArrayList<>();
        ans.add(findPredecessor(root,key).val);
        ans.add(findSuccesor(root,key).val);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.right.left=new TreeNode(4);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        System.out.println(findSuccesor(root,3).val);
        System.out.println(findPredecessor(root,3).val);
        System.out.println(predecessorSuccessor(root,3));

    }
}
