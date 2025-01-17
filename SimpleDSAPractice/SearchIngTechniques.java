package SimpleDSAPractice;

public class SearchIngTechniques {

    public static void LinearSearch(int[] arr,int target)
    {
        for(int e:arr)
        {
            if(e==target)
            {
                System.out.println("Element Found ");
                return;
            }
        }
        System.out.println("Element not Found ");
    }

    public static void BinarySearch(int[]arr , int target)
    {
        int low=0;
        int high=arr.length-1;
        while (low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==target)
            {
                System.out.println("Element found At index "+ mid);
                return;
            } else if (arr[mid]>target) {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};
//        LinearSearch(arr,60);
        BinarySearch(arr,60);
    }
}
