package Prefix_Sum;

public class Number_Of_Sub_Arrays_With_Odd_Sum {


    public int numOfSubarrays(int[] arr) {

        int result=0;
        int cSum=0;
        int evenCount=1;
        int oddCount=0;
        int M = (int)1e9 + 7;
        for(int i=0;i<arr.length;i++)
        {
            cSum+=arr[i];

            if(cSum%2==1)
            {
                result= (result+evenCount ) % M;
                oddCount++;
            }
            else
            {
                result= (result + oddCount) % M;
                evenCount++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Number_Of_Sub_Arrays_With_Odd_Sum obj=new Number_Of_Sub_Arrays_With_Odd_Sum();

        int[] arr={1,3,5};
        System.out.println(obj.numOfSubarrays(arr));
    }
}
