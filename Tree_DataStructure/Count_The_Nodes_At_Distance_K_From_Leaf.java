package Tree_DataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Count_The_Nodes_At_Distance_K_From_Leaf {

  public  static int  printKDistantfromLeaf(TreeNode root, int k)
    {
        // Write your code here
        Set<TreeNode> set=new HashSet<>();

        solve(root,new ArrayList<>(),set,k);

        return set.size();
    }

    public static void solve(TreeNode node,List<TreeNode> curr,Set<TreeNode> set,int k)
    {
        if(node==null)
        {
            return;
        }
        curr.add(node);
        if(node.left==null && node.right==null)
        {
            if(curr.size()>k)
            {
                set.add(curr.get(curr.size()-k-1));
            }
        }
        solve(node.left,curr,set,k);
        solve(node.right,curr,set,k);
        curr.remove(curr.size()-1);
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.left.right=new TreeNode(8);

        System.out.println(printKDistantfromLeaf(root,2));


    }
}
