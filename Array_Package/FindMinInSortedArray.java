package Array_Package;

public class FindMinInSortedArray {

    public static int findMinInSortedArray(int arr[])
    {
        if(arr.length<=1)
        {
            return arr[0];
        }
        int s=0;
        int e=arr.length-1;
        int result=0;
        if(arr[0]< arr[e]) return arr[0];
        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])
            {
                result=arr[mid+1];
                break;
            }
            else if (arr[mid] < arr[mid-1]) {
                result= arr[mid];
                break;
            } else if (arr[s]>arr[e]) {
                //select right half
                s=mid+1;
            }else if(arr[s]<arr[e])
            {
                e=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={11,13,15,17};
        System.out.println(findMinInSortedArray(arr));
    }
}
