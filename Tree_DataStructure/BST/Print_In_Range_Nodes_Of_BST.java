package Tree_DataStructure.BST;

public class Print_In_Range_Nodes_Of_BST {

    int sum=0;
    public  void printInRange(TreeNode root,int start,int end)
    {
        if(root==null) return;
        if(start<root.val && end<root.val)
        {
            printInRange(root.left,start,end);
        } else if (start>root.val && end>root.val) {
            printInRange(root.right,start,end);
        }
        else {

            printInRange(root.left,start,end);
            if(root.val >=start && root.val <=end)
            {
                System.out.print(root.val+" ");
                sum+=root.val;
            }
            printInRange(root.right,start,end);
        }
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

        Print_In_Range_Nodes_Of_BST obj=new Print_In_Range_Nodes_Of_BST();
       obj.printInRange(root,30,75);
        System.out.println(obj.sum);
    }
}
