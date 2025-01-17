package Revision.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Equal_Row_And_Column_Pairs {

    public  static  int equalPairs(int[][] grid) {
        Map<Integer,int[]> rowsMap=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            rowsMap.put(i,grid[i]);
        }
        Map<Integer,int[]> colsMap=new HashMap<>();
        for(int i=0;i<grid[0].length;i++)
        {
            int[]temp=new int[grid[0].length];
            for(int j=0;j< grid.length;j++)
            {
                temp[j]=grid[j][i];
            }
            colsMap.put(i,temp);
//            System.out.println(Arrays.toString(temp));
        }
        int count=0;
        for(int i=0;i<rowsMap.size();i++)
        {
            for(int j=0;j<colsMap.size();j++)
            {
                if(Arrays.equals(rowsMap.get(i),colsMap.get(j)))
                {
                    count++;
                }
            }
        }
       return count;
    }
    public static void main(String[] args) {

        int[][] grid={{3,2,1},{1,7,6},{2,7,7}};
        System.out.println(equalPairs(grid));
    }
}
