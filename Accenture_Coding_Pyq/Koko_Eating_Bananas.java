package Accenture_Coding_Pyq;

public class Koko_Eating_Bananas {
    public static int minEatingSpeed(int[] arr, int h) {

        int start=1;
        int end=getMaxElement(arr);
        int minSpeed=-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;

            int time=timeRequireToEatAtGivenSpeed(mid,arr);
            System.out.println("Mid "+mid + " time"+time);
            if(time<=h)
            {
                minSpeed=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }

        }
        return minSpeed;
    }

    public static int timeRequireToEatAtGivenSpeed(int n,int[]arr)
    {
        int time=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%n==0)
            {
                time+=arr[i]/n;
            }
            else {
                time+=arr[i]/n+1;
            }
        }
       return time;
    }

    public static int getMaxElement(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr={3,6,7,11};
        int h=8;
        System.out.println(minEatingSpeed(arr,h));
    }
}
