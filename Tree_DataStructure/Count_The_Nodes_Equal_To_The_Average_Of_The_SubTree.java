package Tree_DataStructure;

public class Count_The_Nodes_Equal_To_The_Average_Of_The_SubTree {


    int count=0;
    public int averageOfSubtree(TreeNode root) {

       solve(root);
       return count;
    }

    public  int[]  solve(TreeNode node)
    {
        if(node==null) return new int[]{0,0};
        int[] left  = solve(node.left);
        int[] right = solve(node.right);

        int sum=left[0] + right[0] + node.val;

        int countNodes=left[1]+ right[1] + 1;
        int avg= (int) Math.floor(sum/countNodes);
        if(avg==node.val) {
            count++;
        }

        return new int[]{sum,countNodes};
    }


//    public  int getSum(TreeNode root)
//    {
//        if(root==null) return 0;
//
//        int leftSum=getSum(root.left);
//        int rightSum=getSum(root.right);
//
//        return root.val + leftSum + rightSum;
//    }

    public static void main(String[] args) {

    }
}
