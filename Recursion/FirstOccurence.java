package Recursion;

public class FirstOccurence {
    public static int getFirstOccurence(int arr[],int i,int target)
    {
        if (i>arr.length-1) return -1;
        if(arr[i]==target) return i;

        return getFirstOccurence(arr,i+1,target);
    }
    public static int getLastOccurence(int arr[],int i,int target)
    {
        if (i<0) return -1;
        if(arr[i]==target) return i;

        return getLastOccurence(arr,i-1,target);
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,4,8,7,5,45,1};
//        System.out.println(getFirstOccurence(arr,arr.length-1,5));
        System.out.println(getLastOccurence(arr,arr.length-1,5));
    }
}
