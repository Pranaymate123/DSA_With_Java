package Tree_DataStructure;

public class Maximum_Product_Of_Splitted_Binary_Tree {


    long maxP=0;
    int totalSum=0;
    public int getSumOfBinaryTree(TreeNode root,int flag)
    {
        if(root==null)
        {
            return 0;
        }

        int leftSum=getSumOfBinaryTree(root.left,flag);
        int rightSum=getSumOfBinaryTree(root.right,flag);

        long subStreeSum= root.val + leftSum + rightSum; //s1

        if(flag==1)
        {
            long remainingSubTreeSum=totalSum-subStreeSum;
            maxP=Math.max(maxP,subStreeSum*remainingSubTreeSum);
        }

        return (int) subStreeSum;
    }
    public int maxProduct(TreeNode root) {

         totalSum=getSumOfBinaryTree(root,0);

        getSumOfBinaryTree(root,1);


        return(int) (maxP % 1000000007);

    }
    public static void main(String[] args) {

            Maximum_Product_Of_Splitted_Binary_Tree obj=new Maximum_Product_Of_Splitted_Binary_Tree();

            TreeNode root=new TreeNode(1);
            root.left=new TreeNode(2);
            root.right=new TreeNode(3);
            root.left.left=new TreeNode(4);
            root.left.right=new TreeNode(5);
            root.right.left=new TreeNode(6);

        System.out.println(obj.maxProduct(root));
    }
}
