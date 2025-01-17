package Accenture_Coding_Pyq;

public class Array_Index_Operations {

    public static int getResult(int[] arr)
    {
        int n=arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        int sum=0;
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                sum+=arr[i];
            }
            else
            {
                xor=xor^arr[i];
            }
        }
        return sum+xor;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,2,1};
        System.out.println(getResult(arr));
    }
}
