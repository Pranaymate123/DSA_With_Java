package Accenture_Coding_Pyq;

public class SecondSmallest {

    public static int getSecondSmallest(int[] arr)
    {
        int min1=Integer.MAX_VALUE;
        int min2=min1;
        for(int ele:arr)
        {
            if(ele<min1)
            {
                min2=min1;
                min1=ele;

            } else if (ele<min2) {
                min2=ele;
            }
        }
        return min2;
    }
    public static void main(String[] args) {
        int[] arr={45,10,23,54,22,6,3};

        System.out.println(getSecondSmallest(arr));
    }
}
