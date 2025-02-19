package Tree_DataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Create_Binary_Tree_From_Descriptions {

    public static TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> map=new HashMap<>();
        int sum=0;
        for (int[] d:descriptions)
        {
            if(!map.containsKey(d[0]))
            {
                map.put(d[0],new TreeNode(d[0]));
            }
            if(!map.containsKey(d[1]))
            {
                map.put(d[1],new TreeNode(d[1]));
            }
           sum+=d[1];
        }
        int totalSum=0;
        for(Integer key:map.keySet())
        {
            totalSum+=key;
        }
        for(int[] d:descriptions)
        {

            TreeNode parent=map.get(d[0]);
            TreeNode child=map.get(d[1]);
            if(d[2]==1)
            {
                parent.left=child;
            }
            else
            {
                parent.right=child;
            }
        }
        return map.get(totalSum-sum);
    }
    public  static void inorder(TreeNode root)
    {
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.val + "  ");
        inorder(root.right);
    }
    public static void main(String[] args) {

        int[][] descriptions={{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};
        TreeNode root=createBinaryTree(descriptions);
        inorder(root);
    }
}
