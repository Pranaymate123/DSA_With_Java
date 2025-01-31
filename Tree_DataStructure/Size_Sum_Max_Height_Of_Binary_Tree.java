package Tree_DataStructure;

public class Size_Sum_Max_Height_Of_Binary_Tree {


    public static int getSize(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=getSize(root.left);
        int right=getSize(root.right);

        return 1+left+right;
    }

    public static int getSumOfAllElements(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }

        int leftSum= getSumOfAllElements(root.left);
        int rightSum=getSumOfAllElements(root.right);
        return  root.val + leftSum + rightSum;
    }

    public static int getMaxNodeVal(TreeNode root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
        int val=root.val;

        int leftMax=getMaxNodeVal(root.left);

        int rightMax=getMaxNodeVal(root.right);

        return Math.max(val,Math.max(leftMax,rightMax));
    }

    public static int getHeightOfTheTree(TreeNode root)
    {
        if(root==null) return -1;  //in edges return -1 and in term of nodes return 0

        int leftHeight=getHeightOfTheTree(root.left);
        int rightHeight=getHeightOfTheTree(root.right);

        return 1+ Math.max(leftHeight,rightHeight);
    }

    public static boolean searchNode(TreeNode root,int target)
    {

        if(root==null) return false;
        if(root.val==target)
        {
            return true;
        }

        boolean left  = searchNode(root.left,target);
        if(left) return true;
        boolean right=searchNode(root.right,target);
        if(right) return true;

        return false;

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





        System.out.println("Size Of The Tree is ---> " + getSize(root));
        System.out.println("Sum of all elements is ----> "+ getSumOfAllElements(root));
        System.out.println("Max Value is -------> "+ getMaxNodeVal(root));
        System.out.println("Height Of The Tree is ----> "+ getHeightOfTheTree(root));

        System.out.println(searchNode(root,70)?"Element Is Present ": " Element Not Found");
    }
}
