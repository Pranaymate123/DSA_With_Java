package Array_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maximum_Sum_With_At_Most_K_Elements {

    public static long maxSum(int[][] grid, int[] limits, int k) {
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
            for(int j=grid[0].length-1;j>=(grid[0].length-limits[i]);j--)
            {
                lst.add(grid[i][j]);
            }
        }

        lst.sort((a,b)->b-a);
//        System.out.println(lst);
        long result=0;
        for(int i=0;i<k;i++)
        {
            result+=lst.get(i);
        }
        return  result;
    }
    public static void main(String[] args) {
        int[][] grid={{5,3,7},{8,2,6}};
        int[] limit={2,2};
        System.out.println(maxSum(grid,limit,3));
    }
}
