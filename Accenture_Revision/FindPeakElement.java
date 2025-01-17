package Accenture_Revision;

public class FindPeakElement {

    public static int getPeakElement(int[] arr)
    {
        int n=arr.length;
        if(arr[0]>arr[1]) return arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];

        int start=1;
        int end=n-2;
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            {
                return arr[mid];
            }
            else if(arr[mid]>arr[mid-1])
            {
                start=mid;
            }
            else
            {
                end=mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(getPeakElement(arr));
    }
}
