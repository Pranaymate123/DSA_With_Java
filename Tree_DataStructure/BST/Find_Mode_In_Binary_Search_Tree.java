package Tree_DataStructure.BST;

import java.util.HashMap;
import java.util.Map;

public class Find_Mode_In_Binary_Search_Tree {

    int maxFerq=0;
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        solve(root,map);
        int size=0;
        for(Integer key:map.keySet())
        {
            if(map.get(key)==maxFerq) size++;
        }
        int[] ans=new int[size];
        int i=0;
        for(Integer key:map.keySet())
        {
            if(map.get(key)==maxFerq)
            {
                ans[i]=key;
                i++;
            }

        }
        return ans;
    }

    public void solve(TreeNode root, Map<Integer,Integer> map)
    {
        if(root==null)
        {
            return;
        }

        map.put(root.val,map.getOrDefault(root.val,0)+1);
        maxFerq=Math.max(maxFerq,map.get(root.val));

        solve(root.left,map);
        solve(root.right,map);
    }
    public static void main(String[] args) {

    }
}
