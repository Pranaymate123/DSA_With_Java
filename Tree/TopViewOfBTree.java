package Tree;

import java.util.*;

class Pair{
    TreeNode node;
    int line;

    public Pair(TreeNode node, int line) {
        this.node = node;
        this.line = line;
    }
}
public class TopViewOfBTree {
    static ArrayList<Integer> topView(TreeNode root)
    {
       ArrayList<Integer> result=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(root,0));
        while (!q.isEmpty())
        {
            Pair p=q.poll();
            int line=p.line;
            TreeNode temp=p.node;

            if(!map.containsKey(line))
            {
                map.put(line,temp.val);
            }

            if(temp.left!=null)
            {
                q.offer(new Pair(temp.left,line-1));
            }
            if(temp.right!=null)
            {
                q.offer(new Pair(temp.right,line+1));
            }
        }
        map.forEach((key,val)->{
            result.add(val);
        });

       return result;

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(6);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(7);

        System.out.println(topView(root));
    }
}
