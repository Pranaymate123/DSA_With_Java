package Cognizant_Coding_Pyq;

public class Book_Shelf {

    public static int getCount(int[] arr,int k)
    {
        int count=0;
        int rem=0;
        for(int i=0;i<arr.length;i++)
        {
            count+=(rem+arr[i])/k;
            rem=(rem+arr[i])%k;
        }
        if(rem>=k)
        {
            count+=rem/k;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={12,8,10,7};
        int k=10;
        System.out.println(getCount(arr,k));
    }
}
