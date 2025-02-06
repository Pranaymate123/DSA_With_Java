package Tree_DataStructure;

import javax.lang.model.util.Elements;

public class Sum_Root_To_Leaf_Numbers {


    int sum=0;
    public int sumNumbers(TreeNode root) {

        if(root==null) return 0;
        solve(root,root.val+"");
        return sum;
    }

    public  void solve(TreeNode root,String path)
    {
        if (root==null) return;
        if(root.left==null && root.right==null)
        {
            sum+=Integer.parseInt(path);
            return;
        }

        if(root.left!=null)
            solve(root.left,path+root.left.val);

        if(root.right!=null)
            solve(root.right,path+root.right.val);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        Sum_Root_To_Leaf_Numbers obj=new Sum_Root_To_Leaf_Numbers();
        System.out.println(obj.sumNumbers(root));
    }
}
