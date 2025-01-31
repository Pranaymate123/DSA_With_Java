package Tree_DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Find_Leaves_Of_Binary_Tree {

    public static List<List<Integer>> findLeavesOfBinaryTree(TreeNode root)
    {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;

        Map<Integer,List<Integer>>  map=new TreeMap<>();
        getHeight(root,map);
        for(Integer key:map.keySet())
        {
            result.add(new ArrayList<>(map.get(key)));
        }

        return result;
    }
    public static int getHeight(TreeNode root, Map<Integer,List<Integer>> map)
    {
        if(root==null) return 0;

        int leftH=getHeight(root.left,map);

        int rightH=getHeight(root.right,map);

        int height=1+Math.max(leftH,rightH);

        map.putIfAbsent(height,new ArrayList<>());

        map.get(height).add(root.val);

        return height;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
         root.left=new TreeNode(2);
         root.left.left=new TreeNode(4);
         root.left.right=new TreeNode(5);

         root.right=new TreeNode(3);

        System.out.println(findLeavesOfBinaryTree(root));

    }
}
