package Tree_DataStructure;

public class Diameter_Of_Binary_Tree_CodeStoryWithMik {

    int result=0;
    public int diameterOfBinaryTree(TreeNode root) {

        solve(root);
        return result;
    }


    public int solve(TreeNode node)
    {
        if(node==null) return 0;


        int left= solve(node.left);
        int right= solve(node.right);

        result=Math.max(result,left+right);

        // Jo side bada ho use hi return karo taki tumhe longest diameter mile

        return  Math.max(left,right) + 1;
    }

    public static void main(String[] args) {

        Diameter_Of_Binary_Tree_CodeStoryWithMik obj=new Diameter_Of_Binary_Tree_CodeStoryWithMik();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right = new TreeNode(3);

        System.out.println(obj.diameterOfBinaryTree(root));
    }
}
