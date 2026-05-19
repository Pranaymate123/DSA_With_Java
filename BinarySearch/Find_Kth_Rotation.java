package BinarySearch;

public class Find_Kth_Rotation {
    public static int findKRotation(int arr[]) {
        // Code here

        int n=arr.length;

        int l=0;
        int h=n-1;
        while (l<h)
        {
            int mid=l+(h-l)/2;

            if(arr[h]>arr[mid])
            {
                //rotated part is in left
                h=mid;
            }
            else{
//                in right
                l=mid+1;

            }
        }

        return l;

    }


    public static void main(String[] args) {
        int[] nums={5,1,2,3,4};

        System.out.println(findKRotation(nums));
    }
}
