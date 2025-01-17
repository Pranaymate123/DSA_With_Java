package Tree.BST;

import java.util.Stack;

public class KthElement {

    public static int kthSmallest(TreeNode root, int k) {
        int arr[] =new int[1];
        arr[0]=k;
        return findKthSmallest(root,arr).val;

    }

    public static TreeNode findKthSmallest(TreeNode root,int k[])
    {
        if(root==null)
        {
            return null;
        }
        TreeNode left=findKthSmallest(root.left,k);
        if(left!=null)
            return left;
        k[0]--;

        if(k[0]==0)
            return root;

        return findKthSmallest(root.right,k);
    }
    public static int kthLargest(TreeNode root, int k) {
        int arr[] =new int[1];
        arr[0]=k;
        return findKthLargest(root,arr).val;

    }

    public static TreeNode findKthLargest(TreeNode root,int k[])
    {
        if(root==null)
        {
            return null;
        }
        TreeNode right=findKthLargest(root.right,k);
        if(right!=null)
            return right;
        k[0]--;

        if(k[0]==0)
            return root;

        return findKthLargest(root.left,k);
    }



    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        System.out.println(kthSmallest(root,2));

        System.out.println(kthLargest(root,2));
    }
}
