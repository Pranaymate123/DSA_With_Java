package Tree_DataStructure;

public class Binary_Tree_Maximum_Path_Sum {

    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum=Integer.MIN_VALUE;

        solve(root);

        return maxSum;
    }

    public  int solve(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=solve(root.left);
        int right=solve(root.right);

        int neeche_hi_milgaya_answer= left+right+root.val;

        int koi_ek_accha_hai=Math.max(left,right)+ root.val;

        int only_root_accha_hai=root.val;

        maxSum =Math.max(maxSum,Math.max(neeche_hi_milgaya_answer,Math.max(koi_ek_accha_hai,only_root_accha_hai)));

        return Math.max(koi_ek_accha_hai,only_root_accha_hai);
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        Binary_Tree_Maximum_Path_Sum obj=new Binary_Tree_Maximum_Path_Sum();

        System.out.println(obj.maxPathSum(root));
    }
}
