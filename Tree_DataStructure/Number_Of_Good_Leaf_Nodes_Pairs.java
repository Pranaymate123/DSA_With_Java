package Tree_DataStructure;

import java.util.*;

public class Number_Of_Good_Leaf_Nodes_Pairs {


//    ///Appraoch 1 : Using BFS
//    public static int countPairs(TreeNode root, int distance) {
//        Map<TreeNode,TreeNode> map=new HashMap<>();
//
//        List<TreeNode> lst=new ArrayList<>();
//        int result=0;
//        getNodeToParentAndChildNodes(root,map,lst);
//
//        int level;
//
//        for(int i=0;i<lst.size();i++)
//       {
//
//           TreeNode leafNode=lst.get(i);
//           Queue<TreeNode> queue=new LinkedList<>();
//           queue.add(leafNode);
//           Set<TreeNode> visisted=new HashSet<>();
//           visisted.add(leafNode);
//           level=0;
//
////           System.out.println("LeafNode "+ leafNode.val);
//
//
//
//           while (!queue.isEmpty() && level<=distance)
//           {
//                int size=queue.size();
//
//                while (size!=0)
//                {
//
//
//                    TreeNode curr=queue.poll();
//                    if( curr!=leafNode && curr.left==null && curr.right==null)
//                    {
////                        System.out.println("Called For the  Node "+ curr.val);
//                        result++;
//                    }
//                    if(curr.left!=null && !visisted.contains(curr.left))
//                    {
//                        queue.add(curr.left);
//                        visisted.add(curr.left);
//                    }
//                    if(curr.right!=null &&  !visisted.contains(curr.right))
//                    {
//                        queue.add(curr.right);
//                        visisted.add(curr.right);
//                    }
//                    if(map.get(curr)!=null &&  !visisted.contains(map.get(curr)))
//                    {
//
//                        queue.add(map.get(curr));
//                        visisted.add(map.get(curr));
//                    }
//                    size--;
//                }
//                level++;
//           }
//       }
//        return result/2;
//    }
//    public static void getNodeToParentAndChildNodes(TreeNode root,Map<TreeNode,TreeNode> map,List<TreeNode> lst)
//    {
//        if(root==null) return;
//
//        if(root.left==null && root.right==null)
//        {
//            lst.add(root);
//        }
//        if(root.left!=null)
//        {
//            map.put(root.left,root);
//
//            getNodeToParentAndChildNodes(root.left,map,lst);
//        }
//        if(root.right!=null)
//        {
//            map.put(root.right,root);
//            getNodeToParentAndChildNodes(root.right,map,lst);
//        }
//    }

//    // Approach 2 : USING DFS


    int result=0;
    public int countPairs(TreeNode root, int distance) {

        solve(root,distance);
         return result;
    }

    public List<Integer> solve(TreeNode node,int k)
    {
        if(node==null)
        {
            List<Integer> emptyList=new ArrayList<>();
            emptyList.add(0);
            return emptyList;
        }
        if(node.left == null && node.right==null)
        {
            List<Integer> leafList=new ArrayList<>();
            leafList.add(1);
            return leafList;
        }

        List<Integer> leftList=solve(node.left,k);
        List<Integer> rightList=solve(node.right,k);


            for(Integer l:leftList)
            {

                for(Integer r:rightList)
                {
                    if( l!=0 && r!=0 &&  l+r <=k)
                    {
                        result++;
                    }
                }
            }

        List<Integer> currentList=new ArrayList<>();
        // To return to parent add one in each ele of left and rightList

            for(Integer l:leftList)
            {
                if( l!=0 && l+1<=k)
                {
                    currentList.add(l+1);
                }
            }

            for(Integer r:rightList)
            {
                if(r!=0 && r+1<=k)
                {
                    currentList.add(r+1);
                }
            }

        return currentList;
    }

    public static void main(String[] args) {
//        TreeNode root=new TreeNode(1);
//        root.left=new TreeNode(2);
//        root.left.left=new TreeNode(4);
//        root.left.right=new TreeNode(5);
//        root.right=new TreeNode(3);
//        root.right.left=new TreeNode(6);
//        root.right.right=new TreeNode(7);


        TreeNode root=new TreeNode(1);

        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(4);

        Number_Of_Good_Leaf_Nodes_Pairs obj=new Number_Of_Good_Leaf_Nodes_Pairs();
        System.out.println(obj.countPairs(root,3));

    }
}
