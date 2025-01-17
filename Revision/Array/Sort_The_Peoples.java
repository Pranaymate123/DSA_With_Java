package Revision.Array;

import java.util.Arrays;

public class Sort_The_Peoples {

    public static String[] sortPeople(String[] names, int[] heights) {

        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights.length;j++)
            {
                if(heights[i]>heights[j])
                {
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;

                    String tempName=names[i];
                    names[i]=names[j];
                    names[j]=tempName;
                }
            }
        }
        System.out.println(Arrays.toString(heights));

        return names;
    }
    public static void main(String[] args) {
        int[] heights={180,165,170};
        String[] names={"Mary","John","Emma"};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
}
