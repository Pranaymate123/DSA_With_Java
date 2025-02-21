package Tree_DataStructure;

import Recursion.Array;

import java.util.*;

public class Minimum_Number_Of_Operations_To_Sort_A_Binary_Tree_By_Level {

    public int minimumOperations(TreeNode root) {
        int result=0;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int size=queue.size();
            int[] arr=new int[size];
            int i=0;
            while (size!=0)
            {
                TreeNode curr=queue.poll();
                arr[i]=curr.val;
                i++;
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }

                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
                size--;
            }
            result+=minNumberOfOperationsToSortTheList(arr);

        }
        return result;
    }
    public static int minNumberOfOperationsToSortTheList(int[] arr)
    {
        int swaps=0;
         Map<Integer,Integer> map=new HashMap<>();
        int[] sorted=new int[arr.length];
         for(int i=0;i<arr.length;i++)
         {
             map.put(arr[i],i);
             sorted[i]=arr[i];
         }
         Arrays.sort(sorted);


        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==sorted[i]) continue;
            int idx=map.get(sorted[i]);
            map.put(arr[i],idx);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;

            swaps++;

        }

        return swaps;

    }
    public static void main(String[] args) {
        int[] arr={7,6,8,5};
//                5,6,7,8
        System.out.println(minNumberOfOperationsToSortTheList(arr));
    }
}
