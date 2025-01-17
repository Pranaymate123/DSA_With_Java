package Accenture_Coding_Pyq;

public class Peak_Element {

    public static int getPeakElement(int[] arr)
    {
        int n=arr.length;
        if(arr.length==1) return arr[0];
        if(arr[0]>arr[1]) return arr[0];
        if(arr[n-1]>arr[n-2]) return arr[n-1];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])  return arr[i];
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(getPeakElement(arr));
    }
}
