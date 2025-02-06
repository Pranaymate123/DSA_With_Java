package Tree_DataStructure;

import java.util.*;

public class Find_Duplicate_Sub_Tree {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

        List<TreeNode> result=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();

        solve(root,map,result);

        return result;

    }


    public static String solve(TreeNode node, Map<String,Integer> map, List<TreeNode> result)
    {
        if(node==null)  return "N";

        String str=node.val + "," + solve(node.left,map,result) +","+solve(node.right,map,result);

        if(map.getOrDefault(str,0)>0)
        {
            result.add(node);
        }
        else
        {
            map.put(str,1);
        }
        return str;
    }
    public static void main(String[] args) {

    }
}
