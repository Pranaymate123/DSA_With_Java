package Accenture_Coding_Pyq.ScrrenShots;

public class Count_Of_Pairs_Multiple_Of_3 {

    public static int getCountOfUniquePairs(int[] arr)
    {
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]*arr[j] %3==0)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr={5,3,7,4,9,7};
        System.out.println(getCountOfUniquePairs(arr));
    }
}
