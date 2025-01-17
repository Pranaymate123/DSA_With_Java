package Tree.BST;

import java.util.HashMap;
import java.util.Map;

public class TwoSumInBst {
    public static boolean findTarget(TreeNode root, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        return findTargetInorder(root,map,k);
    }

    public static boolean findTargetInorder(TreeNode root, Map<Integer,Integer> map,int k)
    {
        if(root==null)
        {
            return false;
        }
        if(map.containsKey(root.val))
        {
            return true;
        }
        map.put(k-root.val,1);

        return findTargetInorder(root.left,map,k) || findTargetInorder(root.right,map,k);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(7);
        root.right.left=new TreeNode(4);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);

        System.out.println(findTarget(root,3));
    }
}
