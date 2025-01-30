package Tree_DataStructure.Pep_Coding;

import org.w3c.dom.Node;

import java.util.*;

public class Top_View_Of_Binary_Tree {

    static class  Pair{
        TreeNode node;
        int line;

        public Pair(TreeNode node, int line) {
            this.node = node;
            this.line = line;
        }
    }
    public static ArrayList<Integer> topView(TreeNode root) {
        // code here
        Map<Integer,TreeNode> map=new TreeMap<>();
        Queue<Pair> queue=new LinkedList<>();

        map.put(0,root);
        queue.add(new Pair(root,0));

        while (!queue.isEmpty())
        {
            Pair p=queue.poll();
            if(!map.containsKey(p.line))
            {
                map.put(p.line,p.node);
            }
            if(p.node.left!=null)
            {
                queue.add(new Pair(p.node.left,p.line-1));
            }
            if(p.node.right!=null)
            {
                queue.add(new Pair(p.node.right,p.line+1));
            }
        }

        ArrayList<Integer> result=new ArrayList<>();

        for(Integer key:map.keySet())
        {
            result.add(map.get(key).val);
        }

       return result;
    }



    public static void main(String[] args) {

        TreeNode root=new TreeNode(50);
        root.left=new TreeNode(25);
        root.left.left=new TreeNode(12);
        root.left.right=new TreeNode(37);
        root.left.right.left=new TreeNode(30);

        root.right=new TreeNode(75);
        root.right.left=new TreeNode(62);
        root.right.left.right=new TreeNode(70);
        root.right.right=new TreeNode(87);

        System.out.println(topView(root));
    }
}
