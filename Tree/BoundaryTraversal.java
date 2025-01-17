package Tree;



import java.util.ArrayList;
import java.util.Stack;

class Node
 {
     int data;
     Node left, right;

     public Node(int d)
     {
         data = d;
         left = right = null;
     }
 }
public class BoundaryTraversal {

     public static void addLeftBoundary(Node root,ArrayList<Integer> result)
     {
         Node curr=root.left;
         while (curr!=null)
         {
             if(!isLeafNode(curr)) result.add(curr.data );
             if(curr.left!=null) curr=curr.left;
             else  curr=curr.right;
         }
     }
     public static void addRightBoundary(Node root,ArrayList<Integer> result)
     {
         Stack<Integer> stk=new Stack<>();
        Node curr=root.right;
        while(curr!=null)
        {
            if(!isLeafNode(curr)) stk.push(curr.data );
            if(curr.right!=null) curr=curr.right;
            else curr=curr.left;
        }

        while (!stk.isEmpty())
        {
            result.add(stk.pop());
        }

     }

     public static void addLeafNodes(Node node,ArrayList<Integer> result)
     {
         if(node==null)
         {
             return;
         }
         if(isLeafNode(node)) result.add(node.data);
         addLeafNodes(node.left,result);
         addLeafNodes(node.right,result);
     }
     public static boolean isLeafNode (Node node)
     {
         return node.left==null && node.right==null;
     }
    static  ArrayList<Integer> boundary(Node node)
    {
        ArrayList<Integer> result=new ArrayList<>();
        if(!isLeafNode(node)) result.add(node.data);
        addLeftBoundary(node,result);
        addLeafNodes(node,result);
        addRightBoundary(node,result);
        return  result;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList < Integer > boundaryTraversal;
        boundaryTraversal = boundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }
    }
}
