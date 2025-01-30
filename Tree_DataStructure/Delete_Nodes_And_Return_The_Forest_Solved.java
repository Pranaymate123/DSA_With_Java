package Tree_DataStructure.Pep_Coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Delete_Nodes_And_Return_The_Forest_Solved {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> result=new ArrayList<>();
        Set<Integer> set=new HashSet<>();

        for(int e:to_delete)
        {
            set.add(e);
        }

        solve(root,result,set);

        if(!set.contains(root.val))
        {
            result.add(root);
        }


        return result;
    }

    public TreeNode solve(TreeNode root,List<TreeNode> result,Set<Integer> set)
    {
        if(root==null) return null;

        root.left=solve(root.left,result,set);

        root.right=solve(root.right,result,set);

        if(set.contains(root.val))
        {
            if(root.left!=null)
            {
                result.add(root.left);
            }

            if(root.right!=null)
            {
                result.add(root.right);
            }

            return null;
        }
        else {
            return  root;
        }

    }
    public static void main(String[] args) {

    }
}
