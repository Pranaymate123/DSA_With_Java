package Cognizant_Coding_Pyq;

public class Red_Pen_Green_Pen {

    //green --> odd
    //red --> even

    //find number of times you have to swith the pen from green to red
    //that is no. of times when odd is followed by even  odd--> even

    public static int getCount(int[] arr)
    {
        int ans=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]%2==1 && arr[i+1]%2==0)
            {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={70,23,13,26,72,19};

        System.out.println(getCount(arr));
    }
}
