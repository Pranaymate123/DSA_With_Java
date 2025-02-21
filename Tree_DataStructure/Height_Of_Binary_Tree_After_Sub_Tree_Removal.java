package Tree_DataStructure;

public class Height_Of_Binary_Tree_After_Sub_Tree_Removal {

    public int[] treeQueries(TreeNode root, int[] queries) {

        int[] level=new int[100001];
        int[] height=new int[100001];

        int[] maxHeight=new int[100001];
        int[] secondMaxHeight=new int[100001];

        findHeight(root,level,height,maxHeight,secondMaxHeight,0);

        int[] result=new int[queries.length];

        int i=0;
        for(int node:queries)
        {
            int node_ka_height=height[node];
            int node_ka_level=level[node];

//            L+H-1;

            int tempResult = node_ka_level + (maxHeight[node_ka_level] == node_ka_height ? secondMaxHeight[node_ka_level] : maxHeight[node_ka_level]) - 1;

            result[i]=tempResult;
            i++;

        }
        return result;
    }

    public int findHeight(TreeNode node,int[] level,int[] height,int[] maxHeight ,int[] secondMaxHeight,int l)
    {
        if(node==null)
        {
            return 0;
        }

        level[node.val]=l;
        height[node.val]=Math.max(findHeight(node.left,level,height,maxHeight,secondMaxHeight,l+1),findHeight(node.right,level,height,maxHeight,secondMaxHeight,l+1))  + 1;

        if(maxHeight[l] < height[node.val])
        {
            secondMaxHeight[l]=maxHeight[l];
            maxHeight[l]=height[node.val];
        } else if (secondMaxHeight[l]<height[node.val]) {
            secondMaxHeight[l]=height[node.val];
        }

        return height[node.val];
    }

    public static void main(String[] args) {

    }
}
