package Tree_DataStructure;



public class Path_To_Leaf_From_Root {

    public static void printPath(TreeNode root, String path,int sum,int low,int high)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            sum+=root.val;
            if(sum>=low && sum<=high)
            {
                path+=root.val;
                System.out.println(path);
            }
            return;
        }
        System.out.println();
        printPath(root.left,path+root.val+" ",sum+root.val,low,high);
        System.out.println("We are At node --> "+root.val + " and test Path --> "+path);
        printPath(root.right,path+root.val+" ",sum+root.val,low,high);

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

        printPath(root, "",0,0,150);

    }
}
