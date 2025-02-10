package Tree_DataStructure;

import java.util.Deque;
import java.util.LinkedList;

public class Maximum_Width_Of_Binary_Tree {

    static class  Pair{
        TreeNode node;
        int idx;

        public Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
       int maxWidth=0;
        Deque<Pair>  que=new LinkedList<>();
       que.add(new Pair(root,0));
       while(!que.isEmpty())
       {
           int size=que.size();
           Pair leftMost=que.getFirst();
           Pair rightMost=que.getLast();

           maxWidth=Math.max(maxWidth,rightMost.idx- leftMost.idx+1);

           while (size!=0)
           {
               Pair p=que.removeFirst();
               if(p.node.left!=null)
               {
                   que.add(new Pair(p.node.left,2*p.idx+1));
               }
               if(p.node.right!=null)
               {
                   que.add(new Pair(p.node.right,2*p.idx+2));
               }
               size--;
           }
       }
       return maxWidth;
    }
    public static void main(String[] args) {

    }
}
