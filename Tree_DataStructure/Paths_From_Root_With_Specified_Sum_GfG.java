package Tree_DataStructure;

import java.util.ArrayList;

public class Paths_From_Root_With_Specified_Sum_GfG {

    public static ArrayList<ArrayList<Integer>> printPaths(TreeNode root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();

        solve(root,0,result,curr,sum);
        return result;
    }

    public static void solve(TreeNode node,int sum,ArrayList<ArrayList<Integer>> result,ArrayList<Integer> curr,int target)
    {

        if(node==null) return;

        sum=sum+node.val;
        curr.add(node.val);
        if(sum==target)
        {
            result.add(new ArrayList<>(curr));
        }


        solve(node.left,sum,result,curr, target);

        solve(node.right,sum,result,curr, target);


        curr.remove(curr.size()-1);

    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(28);
        root.right=new TreeNode(13);
        root.right.left=new TreeNode(14);
        root.right.left.left=new TreeNode(21);
        root.right.left.right=new TreeNode(22);
        root.right.right=new TreeNode(15);
        root.right.right.left=new TreeNode(23);
        root.right.right.right=new TreeNode(24);

        System.out.println(printPaths(root,38));
    }
}
