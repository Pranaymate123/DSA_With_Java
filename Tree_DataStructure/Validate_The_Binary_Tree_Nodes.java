package Tree_DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Validate_The_Binary_Tree_Nodes {

    public static boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {

        return false;
    }
    public static void main(String[] args) {
        int n=4;
        int[] leftChild={1,-1,3,-1};
        int[] rightChild={2,3,-1,-1};

        System.out.println(validateBinaryTreeNodes(n,leftChild,rightChild));
    }
}
