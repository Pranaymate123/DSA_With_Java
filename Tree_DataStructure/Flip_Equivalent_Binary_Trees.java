package Tree_DataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Flip_Equivalent_Binary_Trees {

//    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
//        int[] map1=new int[101];
//        int[] map2=new int[101];
//
//        Arrays.fill(map1,-2);
//        Arrays.fill(map2,-2);
//        if(root1!=null)   map1[root1.val]=-1;
//        if(root2!=null)     map2[root2.val]=-1;
//
//        getParents(root1,map1);
//        getParents(root2,map2);
//
//        for(int i=0;i<100;i++)
//        {
//            if(map1[i]!=map2[i])
//            {
//                return false;
//            }
//        }
//
//        return true;
//    }
//    public static void getParents(TreeNode root,int[] map)
//    {
//        if(root==null) return;
//
//        if(root.left!=null)
//        {
//            map[root.left.val]=root.val;
//            getParents(root.left,map);
//        }
//
//        if(root.right!=null)
//        {
//            map[root.right.val]=root.val;
//            getParents(root.right,map);
//        }
//    }

    //Approach 2

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null) return true;

        if(root1==null || root2==null) return false;
        boolean withFlip=false;
        boolean withoutFlip=false;
        if(root1.val ==root2.val)
        {
            withoutFlip=flipEquiv(root1.left,root2.left) && flipEquiv(root1.right ,root2.right);

            withFlip=flipEquiv(root1.left,root2.right) && flipEquiv(root1.right,root2.left);

            return  withFlip || withoutFlip;
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
