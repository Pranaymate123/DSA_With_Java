package Tree_DataStructure.BST;

import java.util.HashMap;
import java.util.Map;

public class Target_Sum_Pair_In_BST {

    public static void print(TreeNode root,int target)
    {
        Map<Integer,Integer> map=new HashMap<>();
        solve(root,target,map);
    }

    public static void solve(TreeNode node,int target,Map<Integer,Integer> map)
    {
        if(node==null) return;
        solve(node.left,target,map);

        if(map.containsKey(100-node.val))
        {
            System.out.println((100-node.val)+"  "+ node.val );
            map.put(100-node.val,map.get(100-node.val)-1);
            if(map.get(100-node.val)==0)
            {
                map.remove(100-node.val);
            }
        }
        else
        {
            map.put(node.val,map.getOrDefault(node.val,0)+1);
        }

        solve(node.right,target,map);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(25);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(37);
        root.left.right.left=new TreeNode(30);
        root.left.right.right=new TreeNode(40);
        root.right=new TreeNode(75);
        root.right.left=new TreeNode(62);
        root.right.left.left=new TreeNode(60);
        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        print(root,100);
    }
}

