package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

    public static String searialize(TreeNode root)
    {
        if(root==null) return null;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        StringBuilder result=new StringBuilder("");

        while (!q.isEmpty())
        {
            TreeNode temp=q.peek();
            q.remove();
            if(temp==null)
            {
                result.append("n ");
                continue;
            }
                 result.append(temp.val + " ");

                q.add(temp.left);

                q.add(temp.right);


        }
        return result.toString();
    }
    public static TreeNode deSerialize(String data)
    {
        if(data==null || data.length()==0) return null;
        Queue<TreeNode> q=new LinkedList<>();
        String [] values=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));


        q.add(root);
        for(int i=1;i<values.length;i++)
        {
            TreeNode parent=q.poll();
            if(!values[i].equals("n"))
            {
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                q.add(left);
            }
            if(!values[++i].equals("n"))
            {
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;

    }
    public static void Inorder(TreeNode root)
    {
        if(root==null) return;

        Inorder(root.left);
        System.out.print(root.val+ " ");
        Inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);

        System.out.println(searialize(root));
        String str=searialize(root);

        TreeNode root1=deSerialize(str);

        Inorder(root1);

    }
}
