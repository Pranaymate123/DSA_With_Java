package Tree_DataStructure;

public class Pseudo_Palindromic_Paths_In_Binary_Tree {

//    /// Approach 1 : TC(n) SC(1)
//    public static int pseudoPalindromicPaths (TreeNode root) {
//
//        int[] map=new int[10];
//        return solve(root,map);
//
//    }
//
//    public static int solve(TreeNode node,int[] map)
//    {
//        if(node==null) return 0;
//
//        map[node.val]=map[node.val]+1;
//
//        if(node.left==null && node.right==null)
//        {
//            if(check(map))
//            {
//                map[node.val]=map[node.val]-1;
//                return 1;
//            }
//            map[node.val]=map[node.val]-1;
//            return 0;
//
//        }
//        int left=solve(node.left,map);
//        int right=solve(node.right,map);
//
//        map[node.val]=map[node.val]-1;
//        return left+right;
//    }
//
//    public static boolean check(int[] map)
//    {
//        int odd=0;
//
//        for(int e:map)
//        {
//            if(e%2==1)
//            {
//                odd++;
//            }
//
//        }
//        return odd <= 1;
//    }



    //// Approach 2 : Use Bit Magic
    int result=0;

    public int pseudoPalindromicPaths (TreeNode root) {
        solve(root,0);
        return result;
    }

    public void solve(TreeNode node,int count)
    {
        if(node==null) return;

        count = count ^ (1<<node.val);
        if(node.left==null && node.right==null)
        {
            if((count & (count-1)) ==0 )
            {
                result++;
            }

        }

        solve(node.left,count);
        solve(node.right,count);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(3);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(1);
        root.right=new TreeNode(1);
        root.right.right=new TreeNode(1);

        Pseudo_Palindromic_Paths_In_Binary_Tree obj=new Pseudo_Palindromic_Paths_In_Binary_Tree();
        System.out.println(obj.pseudoPalindromicPaths(root));
    }
}
