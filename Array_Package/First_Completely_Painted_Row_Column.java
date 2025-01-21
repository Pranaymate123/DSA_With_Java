package Array_Package;

import Backtracking_CodeStoryWithMik.Path_With_Maximum_Gold;

import java.util.HashMap;
import java.util.Map;

public class First_Completely_Painted_Row_Column {

    public static int firstCompleteIndex(int[] arr, int[][] mat) {


        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }

        // row check
        int minResult=Integer.MAX_VALUE;
       for(int i=0;i<mat.length;i++)
       {
           int max=-1;
           for(int j=0;j<mat[0].length;j++)
           {
               max=Math.max(max,map.get(mat[i][j]));
           }
           minResult=Math.min(max,minResult);
       }

       for(int i=0;i<mat.length;i++)
       {
           int max=-1;
           for(int j=0;j<mat[0].length;j++)
           {
               max=Math.max(max,map.get(mat[j][i]));
           }
           minResult=Math.min(max,minResult);
       }

       return minResult;

    }
    public static void main(String[] args) {

        int[][] mat={{1,4},{2,3}};;
        int[] arr={1,3,4,2};

        System.out.println(firstCompleteIndex(arr,mat));
    }
}
