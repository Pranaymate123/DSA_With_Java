package Searching;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[]={10,20,40,50,30,70,8,90};
        int target=50;
        int index=search(arr,target);
        System.out.println(index);
    }
    public static  int search(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
