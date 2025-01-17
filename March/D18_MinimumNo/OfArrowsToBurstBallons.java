package March.D18_MinimumNo;

import java.util.Arrays;

public class OfArrowsToBurstBallons {

    public static int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));

        int arrowsCount=1;
        int end=points[0][1];
        for(int i=0;i<points.length;i++)
        {
            if(points[i][0] < end)
            {
                //ek hi arrow me kam ho jayega
                continue;
            }
            else if(points[i][0] > end)
            {
                arrowsCount++;
                end=points[i][1];
            }
        }
        return arrowsCount;
    }

    public static void main(String[] args) {
        int [][] points={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}
