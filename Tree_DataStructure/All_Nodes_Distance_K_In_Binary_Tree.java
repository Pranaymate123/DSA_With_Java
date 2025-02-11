package Tree_DataStructure;

import java.util.*;

public class All_Nodes_Distance_K_In_Binary_Tree {

    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode,TreeNode> map=new HashMap<>();
        Map<TreeNode,Boolean> visited=new HashMap<>();
        storeParentOfEachNode(root,map);
        Queue<TreeNode> que=new LinkedList<>();
//        System.out.println(target.left.val + " "+ target.right.val);

        que.add(target);


        visited.put(target,true);
        int level=0;
        while (!que.isEmpty() && level<k )
        {
//            System.out.println("Que at level "+ level + " Que -> "+ que);
            int size=que.size();
            while (size!=0)
            {
                TreeNode curr=que.poll();
                if(curr.left!=null && !visited.getOrDefault(curr.left,false))
                {
                    que.add(curr.left);
                    visited.put(curr.left,true);
                }
                if(curr.right!=null && !visited.getOrDefault(curr.right,false))
                {
                    que.add(curr.right);
                    visited.put(curr.right,true);
                }
                if( !visited.getOrDefault(map.get(curr),false))
                {
                    if(curr!=root)
                    {
                        que.add(map.get(curr));
                        visited.put(map.get(curr),true);
                    }
                }

                size--;
            }
            level++;
        }
        List<Integer> result=new ArrayList<>();
        while (!que.isEmpty())
        {
            result.add(que.poll().val);
        }
        return result;
    }

    public static void storeParentOfEachNode(TreeNode root,Map<TreeNode,TreeNode> map )
    {
        if(root==null) return;

        if(root.left!=null)
        {
            map.put(root.left,root);
            storeParentOfEachNode(root.left,map);
        }

        if(root.right!=null)
        {
            map.put(root.right,root);
            storeParentOfEachNode(root.right,map);
        }
    }
        public static void main(String[] args)
        {
            TreeNode root=new TreeNode(3);
            root.left=new TreeNode(5);
            root.left.left=new TreeNode(6);
            root.left.right=new TreeNode(2);
            root.left.right.left=new TreeNode(7);
            root.left.right.right=new TreeNode(4);
            root.right=new TreeNode(1);
            root.right.left=new TreeNode(0);
            root.right.right=new TreeNode(8);

            System.out.println(distanceK(root,root.left,2));

        }

}
