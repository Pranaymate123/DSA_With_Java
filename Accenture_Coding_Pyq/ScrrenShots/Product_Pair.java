package Accenture_Coding_Pyq.ScrrenShots;

public class Product_Pair {

    public static int getCountProductPairMultipleOfThree(int[] arr)
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

    public static int getCountProductPairMultipleOfThreeApproach2(int[] arr)
    {
        int cnt=0;
        int n=arr.length-1;
        int countThreeMultiple=0;
        for(int i:arr)
        {
            if(i%3==0) countThreeMultiple++;
        }
        while (countThreeMultiple!=0)
        {
            if(n>=0)
            {
                cnt=cnt+(n);
                n--;
            }
            countThreeMultiple--;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr={3,6,9,12};
        System.out.println(getCountProductPairMultipleOfThree(arr));
    }
}
