package Accenture_Revision;

public class SuperiorElement {

    public static int getSuperiorElement(int[] arr)
    {
        int superior=Integer.MIN_VALUE;
        int sCount=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>superior)
            {
                sCount++;
                superior=arr[i];
            }
        }
        return sCount;
    }
    public static void main(String[] args) {
        int[] arr={7,9,5,2,8,7};
        System.out.println(getSuperiorElement(arr));
    }
}
