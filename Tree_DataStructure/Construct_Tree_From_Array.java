package Tree_DataStructure;

public class Construct_Tree_From_Array {

     static int idx=0;
    public static class TreeNode{
        Integer val;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer val) {
            this.val = val;

        }
    }

    public static  class Pair
    {
        TreeNode node;
        int status;

        public Pair(TreeNode node, int status) {
            this.node = node;
            this.status = status;
        }

        // 1 assifn left
        //2 assign right
        //3 pop from stack
    }

    // Recursive Approach

    public static TreeNode constructBinaryTreeWithRecursiveApproach(Integer[] arr)
    {
        if(idx>=arr.length)
        {
            return null;
        }
        if( arr[idx]==null)
        {
            idx++;
            return null;
        }

        TreeNode root=new TreeNode(arr[idx]);

        idx++;
        root.left=constructBinaryTreeWithRecursiveApproach(arr);

        root.right=constructBinaryTreeWithRecursiveApproach(arr);

        return root;
    }
//    public static TreeNode constructBinaryTree(Integer[] arr)
//    {
//        Stack<Pair> stk=new Stack<>();
//        int i=1;
//
//        TreeNode root=new TreeNode(arr[0]);
//        stk.push(new Pair(root,1));
//        TreeNode temp;
//
//        while (!stk.isEmpty()) {
//            Pair p = stk.peek(); // Peek at the top of the stack
//
//            if (p.status == 1) { // Assign left child
//                if (i < arr.length && arr[i] != null) {
//                    TreeNode leftChild = new TreeNode(arr[i]);
//                    p.node.left = leftChild; // Assign left child
//                    stk.push(new Pair(leftChild, 1)); // Push the new Pair for the left child
//                }
//                p.status = 2; // Update status to assign right next
//                i++; // Move to the next element in the array
//            } else if (p.status == 2) { // Assign right child
//                if (i < arr.length && arr[i] != null) {
//                    TreeNode rightChild = new TreeNode(arr[i]);
//                    p.node.right = rightChild; // Assign right child
//                    stk.push(new Pair(rightChild, 1)); // Push the new Pair for the right child
//                }
//                p.status = 3; // Update status to pop from stack next
//                i++; // Move to the next element in the array
//            } else { // Status 3: Pop from stack
//                stk.pop();
//            }
//        }
//        return root;
//    }

    public static void inOrder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.val+ "  ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Integer[] arr= {10,20,null,30,null,null,40,null,50,null,null};


//        TreeNode root=constructBinaryTree(arr);
        TreeNode root=constructBinaryTreeWithRecursiveApproach(arr);
        inOrder(root);
    }
}
