package Patterns_Based_Questions.Binary_Search;

public class Median_Of_Two_Sorted_Array {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray=new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int k=0;
        while (i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                mergedArray[k]=nums1[i];
                i++;
                k++;
            }
            else{
                mergedArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i<nums1.length)
        {
            mergedArray[k]=nums1[i];
            i++;
            k++;
        }

        while (j<nums2.length)
        {
            mergedArray[k]=nums2[j];
            j++;
            k++;
        }

        double median =0;
        if(mergedArray.length%2!=0)
        {
            median = mergedArray[mergedArray.length/2];
        }
        else{
            int idx = mergedArray.length/2;
            median = (mergedArray[idx-1] + mergedArray[idx] )/2.0;
        }

        median=median/1.0;

        return median;
    }
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};

        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
