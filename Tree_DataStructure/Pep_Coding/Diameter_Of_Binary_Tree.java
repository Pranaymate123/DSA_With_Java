package Tree_DataStructure.Pep_Coding;

import javax.swing.*;

public class Diameter_Of_Binary_Tree {

    //Diameter of the binary tree is the number of the edges between the two farthest nodes in the tree


    static class  DiaPair{
        int height;
        int diameter;


    }


    public  int diameterOfBinaryTree(TreeNode node)
    {

        return getDiameter(node).diameter;

    }

    public static DiaPair getDiameter(TreeNode node)
    {
        if(node==null){
            DiaPair dp=new DiaPair();
            dp.height=-1;
            dp.diameter=0;
            return dp;
        }
        DiaPair lp=getDiameter(node.left);
        DiaPair rp=getDiameter(node.right);

        DiaPair mp=new DiaPair();

        mp.height=Math.max(lp.height,rp.height)+1;

        int factor=lp.height + rp.height +2;
        mp.diameter=Math.max(factor,Math.max(lp.diameter,rp.diameter));

        return mp;

    }



//    public  int height(TreeNode node)
//    {
//        if(node==null) return -1;
//
//        int left=1+height(node.left);
//        int right=1+height(node.right);
//
//        return Math.max(left,right);
//    }
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

        System.out.println(new Diameter_Of_Binary_Tree().diameterOfBinaryTree(root));

    }

}
