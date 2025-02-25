package Tree_DataStructure;

import Tree_DataStructure.Construct_Tree_From_Array;

public class Construct_Binary_Tree_From_Pre_And_Post_Order_Traversal {

    int[] map=new int[31];

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i=0;i<postorder.length;i++)
        {
            map[postorder[i]]=i;
        }
        return solve(0,0,preorder.length-1,preorder,postorder);
    }

    public TreeNode solve(int preStart,int postStart,int preEnd,int[] preorder,int[] postorder)
    {
        if(preStart>preEnd) return null;

        TreeNode root=new TreeNode(preorder[preStart]);
        if(preStart==preEnd) return root;
        int nextNode=preorder[preStart+1];

        int j=map[nextNode];

        int num=j-postStart+1;

        root.left=solve(preStart+1,postStart,preStart+num,preorder,postorder);

        root.right = solve(preStart+num+1,j+1,preEnd,preorder,postorder);

        return root;
    }

    public void display(TreeNode root)
    {
        if(root==null) return;

        display(root.left);
        System.out.print(root.val + "  ");
        display(root.right);
    }

    public static void main(String[] args) {
        int[] preorder={1,2,4,5,3,6,7};
        int[] postorder={4,5,2,6,7,3,1};

        Construct_Binary_Tree_From_Pre_And_Post_Order_Traversal obj=new Construct_Binary_Tree_From_Pre_And_Post_Order_Traversal();

        TreeNode root=obj.constructFromPrePost(preorder,postorder);

        obj.display(root);
    }
}
