package Tree_DataStructure;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> path=new ArrayList<>();

        solve(root,0,targetSum,path,result);

        return result;

    }

    public static void solve(TreeNode node,int sum,int target,List<Integer> path,List<List<Integer>> result)
    {
        if(node==null) return;

        if(node.left==null && node.right==null)
        {
            sum+=node.val;
            path.add(node.val);
//            System.out.println("At node "+ node.val +"Sum is "+ sum);

            if(sum==target)
            {
                result.add(new ArrayList<>(path));
            }

            path.remove(path.size()-1);
            return;
        }

        path.add(node.val);

        solve(node.left,sum+node.val,target,path,result);

        solve(node.right,sum+node.val,target,path,result);

        path.remove(path.size()-1);
    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);

        root.right=new TreeNode(8);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(5);
        root.right.right.right=new TreeNode(1);

        System.out.println(pathSum(root,22));

    }
}
