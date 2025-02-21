package Tree_DataStructure.BST;

public class Size_Sum_Max_Min {
    public static int getSize(TreeNode root) {
        if (root == null) return 0;


        int left = getSize(root.left);
        int right = getSize(root.right);

        return 1 + left + right;
    }

    public static int getSum(TreeNode root) {
        if (root == null) return 0;

        int leftSum = getSum(root.left);
        int rightSum = getSum(root.right);

        return root.val + leftSum + rightSum;
    }

    public static int getMinIterative(TreeNode root) {
        TreeNode curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.val;
    }

    public static int getMinRecursive(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }
        int left = getMinRecursive(root.left);
        return left;
    }

    public static int getMaxIterative(TreeNode root) {
        TreeNode curr = root;
        while (curr.right != null) {
            curr = curr.right;
        }
        return curr.val;
    }

    public static int getMaxRecursive(TreeNode root)
    {
        if(root.right==null)
        {
            return root.val;
        }
        return getMaxRecursive(root.right);
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

        System.out.println(getSize(root));
        System.out.println(getSum(root));

        System.out.println(getMinIterative(root));
        System.out.println(getMinRecursive(root));

        System.out.println(getMaxIterative(root));
        System.out.println(getMaxRecursive(root));


    }
}
