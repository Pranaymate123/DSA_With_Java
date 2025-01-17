package Accenture_Coding_Pyq;

public class Minimum_No_Flips_To_Set_All_Entries {

    public static int getMinimumFlips(int[] arr)
    {
        int pressCount=0;
        for(int i=0;i<arr.length;i++)
        {
            int inverNo=arr[i];
            if(pressCount%2==1)
            {
                inverNo=arr[i]==1?0:1;
            }
            if(inverNo==0)
            {
                pressCount++;
            }
        }
        return pressCount;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,0,1,0,0};
        System.out.println(getMinimumFlips(arr));
    }
}
