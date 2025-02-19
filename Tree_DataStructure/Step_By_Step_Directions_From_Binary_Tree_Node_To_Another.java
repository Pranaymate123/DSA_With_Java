package Tree_DataStructure;

public class Step_By_Step_Directions_From_Binary_Tree_Node_To_Another {

//    public static TreeNode lowestCommonAncestor(TreeNode root, int src,int dest ) {
//
//        if(root==null) return null;
//        if(root.val == src || root.val == dest)
//        {
//            return root;
//        }
//        TreeNode leftFind=lowestCommonAncestor(root.left,src,dest);
//        TreeNode rightFind=lowestCommonAncestor(root.right,src,dest);
//
//        if(leftFind!=null && rightFind!=null)
//        {
//            return root;
//        }
//
//        return leftFind!=null ? leftFind:rightFind;
//    }

    public static String getDirections(TreeNode root, int startValue, int destValue) {
       // TreeNode lcaNode=lowestCommonAncestor(root,startValue,destValue);
        StringBuilder lcaToSrc=new StringBuilder();
        getPathFromRootToTarget(root,startValue,lcaToSrc);

        StringBuilder lcaToDes=new StringBuilder();
        getPathFromRootToTarget(root,destValue,lcaToDes);
        StringBuilder path=new StringBuilder();
        int i=0;
        int j=0;
        while (i<lcaToSrc.length() && j<lcaToDes.length()  && lcaToSrc.charAt(i)==lcaToDes.charAt(j))
        {
            i++;
            j++;
        }
        lcaToSrc= new StringBuilder(lcaToSrc.substring(i));
        lcaToDes= new StringBuilder(lcaToDes.substring(j));
        for(int k=0;k<lcaToSrc.length();k++)
        {
            path.append('U');
        }
        path.append(lcaToDes);


        return path.toString();

    }
    public static boolean getPathFromRootToTarget(TreeNode root,int target,StringBuilder path)
    {
        if(root==null) return false;

        if(root.val==target) return true;

        boolean left=getPathFromRootToTarget(root.left,target,path.append('L'));  //Do and Explore Left
        if(left) return true;
        path.deleteCharAt(path.length()-1);  //Backtrack

        boolean right=getPathFromRootToTarget(root.right,target,path.append('R')); //Do and Explore Right
        if(right) return true;
        path.deleteCharAt(path.length()-1);  //Backtrack

        return false;

    }
    public static void main(String[] args) {

        TreeNode root=new TreeNode(5);
        root.left   =new TreeNode(1);
        root.left.left   =new TreeNode(3);

        root.right=new TreeNode(2);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(4);


        System.out.println(getDirections(root,3,6));

    }
}
