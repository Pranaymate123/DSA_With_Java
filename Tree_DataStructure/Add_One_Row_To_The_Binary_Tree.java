package Tree_DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Add_One_Row_To_The_Binary_Tree {
/*
    public static TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth==1)
        {
            TreeNode node=new TreeNode(val);
            node.left=root;
            return node;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        TreeNode temp=null;
        TreeNode node=null;
        int d=1;
        while (!que.isEmpty())
        {
            node=que.peek();
            int size=que.size();
            if(d==depth-1)
            {
                for(int i=0;i<size;i++) {

                    node=que.poll();
                    temp = node.left;
                    node.left = new TreeNode(val);
                    node.left.left = temp;

                    temp = node.right;
                    node.right = new TreeNode(val);
                    node.right.right = temp;
                }
            }
            else{
                for(int i=0;i<size;i++)
                {
                    node=que.poll();
                    if(node.left!=null)
                    {
                        que.add(node.left);
                    }
                    if(node.right!=null)
                    {
                        que.add(node.right);
                    }
                }
            }

            d++;

        }
        return root;
    }
*/
    //Using DFS

    public static TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth==1)
        {
            TreeNode node=new TreeNode(val);
            node.left=root;

            return node;
        }
        solve(root,val,depth,1);
        return root;

    }


    public static void solve(TreeNode root,int val,int depth,int d)
    {
        if(root==null) return;
        if(d==depth-1)
        {
            TreeNode leftNode=new TreeNode(val);
            leftNode.left=root.left;
            root.left=leftNode;

            TreeNode rightNode=new TreeNode(val);
            rightNode.right=root.right;
            root.right=rightNode;
            return;
        }

        solve(root.left,val,depth,d+1);
        solve(root.right,val,depth,d+1);
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


        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(25);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(37);
        root.left.right.left=new TreeNode(30);

        root.right=new TreeNode(75);
        root.right.left=new TreeNode(62);
        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        root=addOneRow(root,10,3);

        levelOrderTraversal(root);
    }
}
