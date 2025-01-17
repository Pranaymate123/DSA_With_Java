package April;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class A14_SumOfTheRootLeafNumbers {


    public static int sumNumbers(TreeNode root) {
        if(root==null) return 0;

        if(root.left==null && root.right==null)
        {
            return root.val;
        }
        return  Helper(root,0,0);
    }

    public static int Helper(TreeNode root,int sum,int num)
    {
        if(root==null) return 0;
        num=num*10 + root.val;
        if(root.left==null && root.right==null)
        {
            return num;
        }
        int leftSum=Helper(root.left,sum,num);
        int rightSum=Helper(root.right,sum,num);

        sum=leftSum+rightSum;
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
         root.left=new TreeNode(2);

//         root.left.left=new TreeNode(4);
//         root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);
//        root.right.left=new TreeNode(6);
//        root.right.right=new TreeNode(7);

        System.out.println(sumNumbers(root));
    }

}
