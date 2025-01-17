package Array_Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LuckyNumber {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        Map<Integer,Integer> map=new HashMap<>();

        List<Integer> lst=new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
        {
            int minRow=matrix[i][0];

            for(int j=0;j<matrix[0].length;j++)
            {
                minRow=Math.min(minRow,matrix[i][j]);

            }
            if(map.containsKey(minRow))
            {
                lst.add(minRow);
            }
            else
            {
                map.put(minRow,1);
            }
        }

        for(int i=0;i<matrix[0].length;i++)
        {
            int maxCol=matrix[0][i];
            for(int j=0;j<matrix.length;j++)
            {
                maxCol=Math.max(maxCol,matrix[j][i]);
            }
            if(map.containsKey(maxCol))
            {
                lst.add(maxCol);
            }
            else
            {
                map.put(maxCol,1);
            }
        }


        return lst;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,10,4,2},
                        {9,3,8,7},
                        {15,16,17,12}};
        System.out.println(luckyNumbers(matrix));
    }
}
