package Tree_DataStructure;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Maximum_Level_Sum_Of_The_Binary_Tree {

//    public int maxLevelSum(TreeNode root) {
//
//        Queue<TreeNode> que=new LinkedList<>();
//        int maxSum=root.val;
//        int ansLevel=1;
//        que.add(root);
//        int level=1;
//        while (!que.isEmpty())
//        {
//            int size=que.size();
//            int sum=0;
//            while (size!=0)
//            {
//                TreeNode node=que.poll();
//                sum+=node.val;
//
//                if(node.left!=null)
//                {
//                    que.add(node.left);
//                }
//
//                if(node.right!=null)
//                {
//                    que.add(node.right);
//                }
//                size--;
//            }
//
//            if(sum>maxSum)
//            {
//                maxSum=sum;
//                ansLevel=level;
//            }
//            level++;
//        }
//        return ansLevel;
//    }


//    DFS aPPRAOCH

    public int maxLevelSum(TreeNode root) {

        Map<Integer,Integer> map=new TreeMap<>();
        solve(root,0,map);
        int maxSum=Integer.MIN_VALUE;
        int ansLevel=-1;
        for(Integer key:map.keySet())
        {
            if(map.get(key)>maxSum)
            {
                ansLevel=key;
            }
        }
        return ansLevel;
    }

    public static void solve(TreeNode root, int level, Map<Integer,Integer> map)
    {
        if(root==null) return;

        map.put(level,map.getOrDefault(level,0)+ root.val);

        solve(root.left,level+1,map);
        solve(root.right,level+1,map);

    }


    public static void main(String[] args) {

    }
}
