package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,45,55,60,70,75};
        int idx=Bsearch(arr,0,arr.length-1,75);
        System.out.println("Ans is "+idx);

    }

    public static int Bsearch(int arr[],int s,int e,int target)
    {
        int m=s +(e-s)/2;
        if(s>e)
        {
            return -1;
        }
        if(arr[m]==target)
        {
            return  m;
        } else if (arr[m]>target) {
            return Bsearch(arr,s,m-1,target);
        }
        return Bsearch(arr,m+1,e,target);
    }


}
