package Tree_DataStructure.BST;

public class Convert_Sorted_Array_To_Binary_Search_Tree {

    public static  TreeNode sortedArrayToBST(int[] nums) {

        return solve(nums,0,nums.length-1);
    }

    public static TreeNode solve(int[] nums,int start,int end)
    {
        if(start>end) return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);

        root.left = solve(nums,start,mid-1);
        root.right = solve(nums,mid+1,end);

        return root;
    }

    public static void display(TreeNode root)
    {
        if(root==null) return;

        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }
    public static void main(String[] args) {
        int[] nums={-10,-3,0,5,9};

        TreeNode root= sortedArrayToBST(nums);

        display(root);
    }
}
