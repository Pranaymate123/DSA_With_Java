package Array_Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChcolateDistribution {

    public static int minDiff(ArrayList<Integer> arr, int n, int m)
    {
        Collections.sort(arr);
       int min=Integer.MAX_VALUE;

            int s=0;
            int e=s+m-1;

            while (e<n && s<n)
            {
                int dif=arr.get(e)-arr.get(s);
                if (dif < min) {
                    min = dif;
                }
                s++;
                e++;
            }

        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        System.out.println("Minimum Value is "+minDiff(arr,arr.size(),5));
    }
}
