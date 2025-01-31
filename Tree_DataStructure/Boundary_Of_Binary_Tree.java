package Tree_DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Boundary_Of_Binary_Tree {

    public static List<Integer> getBoundaryOfBinaryTree(TreeNode root)
    {
        List<Integer> result=new ArrayList<>();
        //Get the left boundary\
        if(root!=null)
        {
            result.add(root.val);
            getLeftBoundary(root.left,result);
        }
//        System.out.println(result);
        //Leaf Nodes

        if(root.left!=null || root.right!=null)
        {
            getLeafNodes(root,result);
        }
//        System.out.println(result);
        //Get the right Boundary
        List<Integer> temp=new ArrayList<>();
        if(root!=null)
            getRightBoundary(root.right,temp);
        while (!temp.isEmpty())
        {
            int num=temp.get(temp.size()-1);
            result.add(num);
            temp.remove(temp.size()-1);
        }
        return result;
    }

    public static void getLeftBoundary(TreeNode root,List<Integer> result)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        result.add(root.val);

        if(root.left!=null)
            getLeftBoundary(root.left,result);
        else
            getLeftBoundary(root.right,result);
    }

    public static void getLeafNodes(TreeNode root,List<Integer> result)
    {
        if(root==null) return;

        if(root.left==null && root.right==null)
        {
            result.add(root.val);
            return;
        }

        getLeafNodes(root.left,result);
        getLeafNodes(root.right,result);

    }


    public static void getRightBoundary(TreeNode root,List<Integer> temp)
    {

        if(root==null) return;
        if(root.left==null && root.right==null) return;

        temp.add(root.val);

        if(root.right!=null)
            getRightBoundary(root.right,temp);
        else
            getRightBoundary(root.left,temp);
    }



    public static void main(String[] args) {

        TreeNode root=new TreeNode(50);
//        root.left=new TreeNode(25);
//        root.left.left=new TreeNode(12);
//        root.left.right=new TreeNode(37);
//        root.left.right.left=new TreeNode(30);

//        root.right=new TreeNode(75);
//        root.right.left=new TreeNode(62);
//        root.right.left.right=new TreeNode(70);
//        root.right.right=new TreeNode(87);

        System.out.println(getBoundaryOfBinaryTree(root));

    }
}
