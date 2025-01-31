package Tree_DataStructure;

public class Leaf_Similar_Trees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        StringBuilder getLeavesTree1=new StringBuilder();
        getLeavesOgfBinaryTree(root1,getLeavesTree1);
        StringBuilder getLeavesTree2=new StringBuilder();
        getLeavesOgfBinaryTree(root2,getLeavesTree2);

        return getLeavesTree1.toString().equals(getLeavesTree2.toString());
    }

    public static void getLeavesOgfBinaryTree(TreeNode root,StringBuilder result)
    {
        if(root==null) return;
        if(root.left==null && root.right==null)
        {
            result.append(root.val);
            result.append("-"); /// Adding this beacuse suppose the first tree has leafs are 6,7,14,9,8
            //While others has 6,71,4,98   then if we form the simple string without "-"  then we get 671498 for both which return true
            //To avoid that I have added the "-" in between the leaf nodes so we get for t1=> "6-7-14-9-8" for T2 => 6-71-4-98
        }

        getLeavesOgfBinaryTree(root.left,result);
        getLeavesOgfBinaryTree(root.right,result);
    }
    public static void main(String[] args) {

    }
}
