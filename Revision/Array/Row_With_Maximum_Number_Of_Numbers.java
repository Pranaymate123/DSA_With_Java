package Revision.Array;

public class Row_With_Maximum_Number_Of_Numbers {
    public int rowWithMax1s(int arr[][]) {
        int max=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            int cnt_ones=arr[i].length-getLowerBound(arr[i]);
            if(cnt_ones>max)
            {
                max=cnt_ones;
                ans=i;
            }
        }
        return ans;
    }

    public static int getLowerBound(int[] arr)
    {
        int ans=0;
        int low=0;
        int high=arr.length-1;
        if(arr[low]==0 && arr[high]==0) return arr.length;  // for the case 0,0,0,0
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==1)
            {
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
