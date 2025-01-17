package June;

import java.util.Arrays;

public class D10_Height_Checker {
    public static int heightChecker(int[] heights) {

        int[] temp=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            temp[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=temp[i])
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] heights={1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
