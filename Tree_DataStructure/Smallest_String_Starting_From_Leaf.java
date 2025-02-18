package Tree_DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Smallest_String_Starting_From_Leaf {

    ///Approach 1 : --> DFS
//
//    String result="";
//    public   String smallestFromLeaf(TreeNode root) {
//
//
//        solve(root,new StringBuilder());
//
//        return result;
//
//    }
//
//    public  void solve(TreeNode node, StringBuilder curr)
//    {
//
//        if(node==null)
//        {
//            return;
//        }
//        curr.append((char) ('a'+node.val));
//        if(node.left==null && node.right==null)
//        {
//            String temp=curr.reverse().toString();
//            if(result.equals(""))
//            {
//                result=temp;
//            }
//            else if(result.compareTo(temp)>0)
//            {
//                result=temp;
//            }
//            curr.reverse();
//        }
//
//        solve(node.left,curr);
//        solve(node.right,curr);
//        curr.deleteCharAt(curr.length()-1);
//    }

    /// Approach 2 --> BFS
    static class Pair
    {
        TreeNode node;
        String str;

        public Pair(TreeNode node, String str) {
            this.node = node;
            this.str = str;
        }
    }

    String result="";
    public String smallestFromLeaf(TreeNode root) {
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(root,""+(char)('a'+root.val)));
        while (!queue.isEmpty())
        {
          Pair p=queue.poll();
          String s=p.str;
          if(p.node.left!=null)
          {
              queue.add(new Pair(p.node.left,s+(char)('a'+p.node.left.val)));
          }

            if(p.node.right!=null)
            {
                queue.add(new Pair(p.node.right,s+(char)('a'+p.node.right.val)));
            }

            if(p.node.left==null && p.node.right ==null)
            {
                String temp=new StringBuilder(p.str).reverse().toString();
                if(result.equals(""))
                {
                    result=temp;
                } else if (result.compareTo(temp)>0) {
                    result=temp;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        Smallest_String_Starting_From_Leaf obj=new Smallest_String_Starting_From_Leaf();
        System.out.println(obj.smallestFromLeaf(root));

    }
}
