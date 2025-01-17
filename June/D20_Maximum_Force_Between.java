package June;

import java.util.Arrays;

public class D20_Maximum_Force_Between {
    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int optimal = 0;
        int l = 0;
        int h = position[position.length - 1];
        while (l <= h) {
            int mid= l + (h-l)/2;
            if(isPlacementPossible(position,m,mid))
            {
                optimal=mid;
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return optimal;
    }
    private static boolean isPlacementPossible(int[] positions, int m, int max) {
        int count=1;
        int last=positions[0];
        for(int i=0;i<positions.length;i++)
        {
            if(positions[i]-last>=max)
            {
                count++;
                last=positions[i];
            }
        }
        return  count>=m;
    }



    public static void main(String[] args) {
        int [] arr={1,2,3,4,7};
        int m=3;
        System.out.println(maxDistance(arr,m));
    }
}
