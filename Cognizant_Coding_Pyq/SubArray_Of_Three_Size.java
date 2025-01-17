package Cognizant_Coding_Pyq;

public class SubArray_Of_Three_Size {

    public static int getCountOfSubarrays(int[] arr)
    {
        int i=0;
        int j=1;
        int k=2;
        int count=0;
        while (k<arr.length)
        {
            if(arr[i]+arr[k]==arr[j])
            {
                count++;
            }
            i++;
            j++;
            k++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,2,4,2};
        System.out.println(getCountOfSubarrays(arr));
    }
}
