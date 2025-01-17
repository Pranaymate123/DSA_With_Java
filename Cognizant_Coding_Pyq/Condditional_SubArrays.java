package Cognizant_Coding_Pyq;

public class Condditional_SubArrays {

    //How many sub-arrays can be formed such a that the sum of the largest and smallest element is <=k
    public static int getCountOfConditionalSubArrays(int[] arr,int k)
    {
        int i=0;
        int j=arr.length-1;

        int cnt=0;
        while(i<=j)
        {
            if(arr[i]+arr[j] <= k)
            {
                cnt=cnt+(j-i+1);
                i++;
            }
            else {
                j--;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        int[] arr={1,3,5,8};
        int k=9;
        System.out.println(getCountOfConditionalSubArrays(arr,k));
    }
}

