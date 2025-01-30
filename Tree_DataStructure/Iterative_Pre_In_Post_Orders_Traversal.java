package Tree_DataStructure.Pep_Coding;



import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Iterative_Pre_In_Post_Orders_Traversal {

    public static void iterativePreOrderTraversal(TreeNode root)
    {
        Stack<TreeNode> stk=new Stack<>();
        stk.push(root);
        TreeNode curr=null;
        while (!stk.isEmpty())
        {
            curr=stk.pop();
            System.out.print(curr.val+" ");
            //Go to right
            if(curr.right!=null)
            {
                stk.push(curr.right);
            }
            if(curr.left!=null)
            {
                stk.push(curr.left);
            }
        }
    }

    public static void iterativePostOrder(TreeNode root)
    {
        Map<Integer,Boolean> isVisited=new HashMap<>();
        Stack<TreeNode> stk=new Stack<>();
        stk.push(root);
        isVisited.put(root.val,true);
        TreeNode curr=null;
        while (!stk.isEmpty())
        {
            curr=stk.peek();

            boolean flag=false;
            if(  curr.right!=null && !isVisited.getOrDefault(curr.right.val,false))
            {
                stk.push(curr.right);
                isVisited.put(curr.right.val,true);
               flag=true;
            }
            if( curr.left!=null &&!isVisited.getOrDefault(curr.left.val,false))
            {
                stk.push(curr.left);
                isVisited.put(curr.left.val,true);
                flag=true;
            }
            if(!flag)
            {
                curr=stk.pop();
                System.out.print(curr.val + "  ");
            }
        }
    }

    public static void iterativeInOrder(TreeNode root)
    {
        Stack<TreeNode> stk=new Stack<>();
        TreeNode curr=root;

        while (true)
        {

            if(curr!=null)
            {
                stk.push(curr);
                curr=curr.left;
            }
            else
            {
                if(stk.isEmpty())
                {
                    break;
                }

                curr=stk.pop();
                System.out.print(curr.val+"  ");
                curr=curr.right;
            }
        }
    }


    static  class  Pair
    {
        TreeNode node;
        int status;

        public Pair(TreeNode node, int status) {
            this.node = node;
            this.status = status;
        }
    }
    public static void iterativeInOrderPreOrderAndPostOrderInSameWay(TreeNode root)
    {
        StringBuilder preorder=new StringBuilder();
        StringBuilder inorder=new StringBuilder();
        StringBuilder postorder=new StringBuilder();

        Stack<Pair> stk=new Stack<>();

        stk.push(new Pair(root,1));

        TreeNode curr=null;
        while (!stk.isEmpty())
        {


            Pair p=stk.peek();
            if(p.status==1)
            {
                preorder.append(p.node.val);
                preorder.append("  ");
                p.status=2;
                
                if(p.node.left!=null)
                {
                    TreeNode leftChild=p.node.left;
                    stk.push(new Pair(leftChild,1));
                }
            } else if (p.status==2) {
                inorder.append(p.node.val);
                inorder.append("  ");
                p.status=3;

                if(p.node.right!=null)
                {
                    TreeNode rightChild=p.node.right;
                    stk.push(new Pair(rightChild,1));
                }
            }
            else
            {
                postorder.append(p.node.val);
                postorder.append("  ");
                stk.pop();
            }
        }

        System.out.println("PreOrder Traversal "+ preorder);
        System.out.println("InOrder Traversal "+ inorder);
        System.out.println("PostOrder Traversal "+ postorder);

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

//        System.out.println("Iterative Pre Order");
//        iterativePreOrderTraversal(root);
//
//        System.out.println();
//        System.out.println("Iterative Post Order");
//        iterativePostOrder(root);
//
//        System.out.println();
//        System.out.println("Iterative In Order");
//        iterativeInOrder(root);


       iterativeInOrderPreOrderAndPostOrderInSameWay(root);

    }
}
