package Recursion.CodeStoryWithMik;

class  Node{
    int data;
    Node next;

    Node bottom;
}
public class Flattening_A_Linked_List {

    public static Node mergeSortedList(Node L1,Node L2)
    {

        if(L1==null)
        {
            return L2;
        }
        if(L2==null)
        {
            return L1;
        }
        Node result;
        if(L1.data<L2.data)
        {
            result=L1;
            result.bottom=mergeSortedList(L1.bottom,L2);
        }else
        {
            result=L2;
            result.bottom= mergeSortedList(L1,L2.bottom);
        }

        return result;

    }
    public Node flatten(Node root) {

        if(root==null)
        {
            return null;
        }
        Node root2=flatten(root.next);

        return mergeSortedList(root,root2);
    }
    public static void main(String[] args) {

    }
}
