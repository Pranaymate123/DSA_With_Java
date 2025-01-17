package Tree;

import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {

    public static void getAllPathsFromRootToLeaves(TreeNode root,List<Integer> ds,List<List<Integer>> ans)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null && root.right==null)
        {
            ds.add(root.val);
            ans.add(new ArrayList<>(ds));
            ds.remove(ds.size()-1);
            return;
        }
        ds.add(root.val);
        getAllPathsFromRootToLeaves(root.left,ds,ans);

        getAllPathsFromRootToLeaves(root.right,ds,ans);
        ds.remove(ds.size()-1);

    }

    public static List<List<Integer>> rootToLeaves(TreeNode root)
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        if(root==null) return ans;
        getAllPathsFromRootToLeaves(root,ds,ans);

        return ans;

    }

    public static boolean getPath(TreeNode root, List<Integer> lst,int x)
    {
        if(root==null) return false;
        lst.add(root.val);

        if(root.val==x)
        {
            return true;
        }
        if(getPath(root.left,lst,x) || getPath(root.right,lst,x))
        {
            return true;
        }
        lst.remove(lst.size()-1);
        return false;
    }
    public static List<Integer>  solve(TreeNode root,int b)
    {
        List<Integer> lst=new ArrayList<>();
        if(root==null) return lst;
        getPath(root,lst,b);

        return lst;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(6);
        root.left.right.right=new TreeNode(7);
        root.right=new TreeNode(3);

//        System.out.println(solve(root,7));
        System.out.println(rootToLeaves(root));
    }
}
