package Accenture_Coding_Pyq;

public class Find_Peak_Element {

    public static int findPeak(int[] arr)
    {
        int n=arr.length;
        if(n==1) return arr[0];
        if(arr[0]>arr[1]) return arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];

        int left=1;
        int right=arr.length-2;
        while (left<right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return arr[mid];
            } else if (arr[mid]>arr[mid-1]) {
                left=mid;
            }
            else
            {
                right=mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4,3,2};
        System.out.println(findPeak(arr));
    }
}
