package Tree_DataStructure;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.List;

public class Morris_Traversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr=root;

        List<Integer> result=new ArrayList<>();
        while (curr!=null)
        {
            if(curr.left==null)
            {
                result.add(curr.val);
                curr=curr.right;
            }
            else
            {
                TreeNode pred=curr.left;
                while (pred.right!=null)
                {
                    pred=pred.right;
                }
                pred.right=curr;   // Making the thred from Predecessor to curr node

//                curr ke left ko temp use karke hum null mark kar de rahe hai jisse hoga yeh ki hume while loop ki else conddition me fasenge nahi
                TreeNode temp=curr;
                curr=curr.left;

                temp.left=null;
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        root.right=new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }
}
