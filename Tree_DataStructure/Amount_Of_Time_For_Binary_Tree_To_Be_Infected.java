package Tree_DataStructure;

import java.util.*;

public class Amount_Of_Time_For_Binary_Tree_To_Be_Infected {

///// By Level Order Traversal Approach 1
//    TreeNode startNode=null;
//    public  int amountOfTime(TreeNode root, int start) {
//
//        int count=0;
//        Queue<TreeNode> queue=new LinkedList<>();
//        Map<TreeNode,TreeNode> parentMap=new HashMap<>();
//        Set<Integer> visited=new HashSet<>();
//        //Call
//        getParentNodes(root,parentMap,start);
//
////        System.out.println(startNode.val);
//        visited.add(startNode.val);
//        queue.add(startNode);
//
//        while (!queue.isEmpty())
//        {
//            int size=queue.size();
//            while (size!=0)
//            {
//                TreeNode node=queue.poll();
//                if(node.left!=null && !visited.contains(node.left.val))
//                {
//                    queue.add(node.left);
//                    visited.add(node.left.val);
//                }
//                if(node.right!=null && !visited.contains(node.right.val))
//                {
//                    queue.add(node.right);
//                    visited.add(node.right.val);
//
//                }
//
//                if(node!=root  && !visited.contains(parentMap.get(node).val))
//                {
//                    queue.add(parentMap.get(node));
//                    visited.add(parentMap.get(node).val);
//                }
//                size--;
//            }
//            count++;
//        }
//
//        return count-1;
//
//    }
//
//    public  void getParentNodes(TreeNode root,Map<TreeNode,TreeNode> map,int start)
//    {
//        if(root==null) return;
//
//        if(root.val==start)
//        {
//            startNode=root;
//        }
//        if(root.left!=null)
//        {
//             map.put(root.left,root);
//             getParentNodes(root.left,map,start);
//        }
//
//        if(root.right!=null)
//        {
//            map.put(root.right,root);
//            getParentNodes(root.right,map,start);
//        }
//    }

    ///// By Recursive Approach 2

    int result=0;
    public int amountOfTime(TreeNode root, int start) {
        solve(root,start);
        return result;
    }

    public int solve(TreeNode node,int start)
    {
        if(node==null) return 0;

        int left=solve(node.left,start);
        int right=solve(node.right,start);

        if(node.val==start)
        {
            result=Math.max(left,right);
            return -1;
        }
        else if(left >= 0 && right >= 0)
        {
            return Math.max(left,right) + 1;

        }
        else
        {
            // we found the start node at left or right
            result=Math.max(result,Math.abs(left) + Math.abs(right));
            return Math.min(left,right)-1;
        }
    }

    public static void main(String[] args) {

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(5);
//        root.right = new TreeNode(3);
//
//        root.left.right = new TreeNode(4);
//        root.right.left = new TreeNode(10);
//        root.right.right = new TreeNode(6);
//
//        root.left.right.left = new TreeNode(9);
//        root.left.right.right = new TreeNode(2);

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.left.left=new TreeNode(4);
        root.left.left.left.left=new TreeNode(5);
        Amount_Of_Time_For_Binary_Tree_To_Be_Infected obj=new Amount_Of_Time_For_Binary_Tree_To_Be_Infected();

        System.out.println(obj.amountOfTime(root,1));

    }
}
