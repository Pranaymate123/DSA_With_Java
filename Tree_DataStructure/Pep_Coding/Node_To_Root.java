package Tree_DataStructure.Pep_Coding;

import java.util.ArrayList;
import java.util.List;

public class Node_To_Root {

    static List<Integer> path=new ArrayList<>();

    public static boolean find(TreeNode root,int target)
    {
        if(root==null) return false;

        if(root.val==target)
        {
            path.add(root.val);
            return true;
        }

        boolean leftFind=find(root.left,target);

        if(leftFind) {
            path.add(root.val);
            return true;
        }

        boolean rightFind=find(root.right,target);

        if(rightFind)
        {
            path.add(root.val);
            return true;
        }

        return false;
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


        System.out.println(find(root,70)?"Element Found":"Element Not Found");
        System.out.println("Node to root Path IS "+ path);
    }



}
