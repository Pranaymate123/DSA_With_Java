package Tree_DataStructure;

import java.util.HashSet;
import java.util.Set;

public class Find_Elements_In_Contaminated_Binary_Tree {


    public static void main(String[] args) {

    }
}
class FindElements {

    TreeNode root;
    Set<Integer> set;
    public FindElements(TreeNode root) {
        this.root=root;
        set=new HashSet<>();
        recoverTree(root,set);
    }

    public boolean find(int target) {
        return set.contains(target);
    }

    public void recoverTree(TreeNode node,Set<Integer> set)
    {
        if(node==null) return;

        if(node==root)
        {
            node.val=0;
            set.add(0);
        }

        if(node.left!=null)
        {
            int val=2 * node.val + 1;
            set.add(val);
            node.left.val=val;
            recoverTree(node.left,set);
        }
        if(node.right!=null)
        {
            int val = 2 * node.val + 2;
            set.add(val);
            node.right.val=val;
            recoverTree(node.right,set);
        }
    }
}
