package May;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class M10_Kth_Smallest_Fraction {

    static class  Pair
    {
        int Nr;
        int dr;
        double fraction;

        public Pair(int nr, int dr, double fraction) {
            Nr = nr;
            this.dr = dr;
            this.fraction = fraction;
        }
    }
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double[] nums=new double[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=arr[i];
        }

        Comparator<Pair> pairComparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair a, Pair b) {

                return Double.compare(b.fraction, a.fraction);
            }
        };

        // Create a PriorityQueue<Pair> with the custom comparator
        PriorityQueue<Pair> pq = new PriorityQueue<>(pairComparator);



        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                pq.add(new Pair(arr[i],arr[j],nums[i]/nums[j]));
                if(pq.size() > k)
                {
                    pq.poll();
                }
            }
        }
        int a=pq.peek().Nr;
        int b=pq.peek().dr;
        int[] result=new int[2];
        result[0]=a;
        result[1]=b;

        return result;
    }

    public static void main(String[] args) {

       int[] arr={1,7};
       int k=1;
        System.out.println(Arrays.toString(kthSmallestPrimeFraction(arr,k)));
    }
}
