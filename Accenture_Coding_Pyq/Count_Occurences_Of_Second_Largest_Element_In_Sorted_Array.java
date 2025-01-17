package Accenture_Coding_Pyq;

public class Count_Occurences_Of_Second_Largest_Element_In_Sorted_Array {

    public static int getCountOfOccurences(int[] arr)
    {
        int n= arr.length;
        if(n==1) return 0;
        int left=0;
        int right=arr.length-1;
        int mid=0;
        int ans=0;
        boolean flag=false;
        while (left<right)
        {
             mid=(right+left)/2;
            if(arr[mid]!=arr[n-1])
            {
                ans=mid;
                left=mid+1;
                flag=true;
            } else
            {
                right=mid-1;
            }
        }
        if(!flag) return 0;

        System.out.println(arr[ans]);
        int l=ans;
        int r=ans+1;
        int cnt=0;
        while (l>=0 && arr[l]==arr[ans])
        {
            l--;
            cnt++;
        }
        while (r<n && arr[r]==arr[ans])
        {
            r++;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
//        int[] arr={1,2,2,2,3,3,3,4,4,4,4,5,5,5};
        int[] arr={0,0,0,0,0,0,0,0,1};
        System.out.println(getCountOfOccurences(arr));
    }
}
