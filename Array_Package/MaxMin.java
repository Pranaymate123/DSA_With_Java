package Array_Package;

public class MaxMin {

    public static int getSumOfMaxMin(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return max+min;
    }
    public static void main(String[] args) {
        int arr[]={-2, 1, -4, 5, 3};
        System.out.println(getSumOfMaxMin(arr));

    }
}
