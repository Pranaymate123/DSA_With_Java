package Accenture_Coding_Pyq.ScrrenShots;

public class Sum_Of_Even_Positions_After_Reverse {


    public static int getSumOfEvenPosAfterReverse(int [] arr)
    {
        int sum=0;
        for(int i=arr.length-1;i>=0;i=i-2)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        System.out.println(getSumOfEvenPosAfterReverse(arr));
    }
}
