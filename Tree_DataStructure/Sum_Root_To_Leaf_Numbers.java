package Tree_DataStructure;
public class Sum_Root_To_Leaf_Numbers {



    public int sumNumbers(TreeNode root) {

        if(root==null) return 0;
       return solve(root,0);

    }

    public  int  solve(TreeNode root,int  sum)
    {
        if(root==null) return 0;
        sum=sum*10 + root.val;
        if(root.left==null && root.right==null)
        {
            return  sum;
        }

        int leftSum=solve(root.left,sum);

        int rightSum=solve(root.right,sum);

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        Sum_Root_To_Leaf_Numbers obj=new Sum_Root_To_Leaf_Numbers();
        System.out.println(obj.sumNumbers(root));
    }
}
