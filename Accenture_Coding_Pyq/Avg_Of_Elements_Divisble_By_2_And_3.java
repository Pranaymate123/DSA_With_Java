package Accenture_Coding_Pyq;

public class Avg_Of_Elements_Divisble_By_2_And_3 {

    public static int getAverage(int[] arr)
    {
        int sum=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]%3==0)
            {
                cnt++;
                sum+=arr[i];
            }
        }
        return (int) sum/cnt;
    }
    public static void main(String[] args) {
        int[] arr={12,24,3,5,6,7,8,9,18};
        System.out.println(getAverage(arr));
    }
}
