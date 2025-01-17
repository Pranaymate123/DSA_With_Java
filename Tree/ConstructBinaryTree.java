package Tree;


import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTree {

//    public static TreeNode buildTree(int[] preorder, int[] inorder) {
//        //Store the inorder in the map
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<inorder.length;i++)
//        {
//            map.put(inorder[i],i);
//        }
//        return constructBinaryTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
//    }
//    public static TreeNode constructBinaryTree(int[] preOrder ,int preStart,int preEnd, int[] inOrder ,int inStart,int inEnd, Map<Integer,Integer> map)
//    {
//        if(preStart > preEnd || inStart > inEnd)
//        {
//            return null;
//        }
//        TreeNode root= new TreeNode(preOrder[preStart]);
//
//        //index of the root node
//        int inRoot = map.get(root.val);
//        //nodes in left
//        int numsLeft= inRoot-inStart;
//
//          root.left=constructBinaryTree(preOrder,preStart+1,preStart+numsLeft, inOrder, inStart,inRoot-1,map);
//         root.right=constructBinaryTree(preOrder,preStart+numsLeft+1,preEnd, inOrder, inRoot+1,inEnd,map);
//
//         return root;
//    }


        public static TreeNode buildTree2(int[] postorder, int[] inorder) {
        //Store the inorder in the map
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return constructBinaryTree2(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
    }
    public static TreeNode constructBinaryTree2(int[] postOrder ,int postStart,int postEnd, int[] inOrder ,int inStart,int inEnd, Map<Integer,Integer> map) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(postOrder[postEnd]);

        //index of the root node
        int inRoot = map.get(root.val);
        //nodes in left
        int numsRight = inEnd - inRoot;


        root.right = constructBinaryTree2(postOrder, postEnd - numsRight, postEnd - 1, inOrder, inRoot + 1, inEnd, map);
        root.left = constructBinaryTree2(postOrder, postStart, postEnd - numsRight - 1, inOrder, inStart, inRoot - 1, map);

        return root;
    }

    public static void Inorder(TreeNode root)
    {
        if(root==null) return;

        Inorder(root.left);
        System.out.print(root.val+ " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
//        int [] inorder={40,20,50,10,60,30};
//        int [] preorder={10,20,40,50,30,60};
        int [] inorder={9,3,15,20,7};
        int [] postorder={9,15,7,20,3};
//       TreeNode root= buildTree(preorder,inorder);
        TreeNode root=buildTree2(postorder,inorder);
      Inorder(root);
    }
}
