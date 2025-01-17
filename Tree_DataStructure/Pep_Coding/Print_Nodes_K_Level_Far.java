package Tree_DataStructure.Pep_Coding;

import java.util.ArrayList;
import java.util.List;

public class Print_Nodes_K_Level_Far {

    static List<TreeNode> path;

    public static boolean find(TreeNode root,int target)
    {
        if(root==null) return false;

        if(root.val==target)
        {
            path.add(root);
            return true;
        }

        boolean leftFind=find(root.left,target);

        if(leftFind) {
            path.add(root);
            return true;
        }

        boolean rightFind=find(root.right,target);

        if(rightFind)
        {
            path.add(root);
            return true;
        }

        return false;
    }
    public static void printKLevelsDown(TreeNode node,int k,TreeNode blocker)
    {
        if(node==null || k<0 || node==blocker) return;

        if(k==0)
        {
            System.out.print(node.val + " " );
        }

        printKLevelsDown(node.left,k-1,blocker);

        printKLevelsDown(node.right,k-1,blocker);
    }
    public static void printNodesKLevelFar(TreeNode root,int data,int k)
    {

        path=new ArrayList<>();
        find(root,data);

        for(int i=0;i<path.size();i++)
        {
            printKLevelsDown(path.get(i),k-i,i==0?null:path.get(i-1));
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

        printNodesKLevelFar(root,37,2);
    }
}
