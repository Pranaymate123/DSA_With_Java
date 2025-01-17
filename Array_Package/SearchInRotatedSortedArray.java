package Array_Package;

public class SearchInRotatedSortedArray {
        //7 8 9 1 2 3 4 5 6
    public  static  int search(int [] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            //check which half is sorted
           if(arr[start]<=arr[mid])
           {
               //first halsf is sorted
               if(target>=arr[start] && target<arr[mid])
               {
                   end=mid-1;
               }
               else {
                   start=mid+1;
               }
           }
           else {
               //if first half is not sorted that means the second half is sorted for sure
               if(target>arr[mid] && target<=arr[end])
               {
                   start=mid+1;
               }
               else {
                   end=mid-1;
               }
           }

        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,8,12,1,2,3};
        System.out.println("Index is "+search(arr,3));
    }
}
