package Array_Package;

public class BitWise_Xor_Of_All_Pairings {


    public static int xorAllNums(int[] nums1, int[] nums2) {

        int result=0;
        int n=nums1.length;
        int m=nums2.length;
        for(int i:nums1)
        {
            if(m%2==1)
            {
                result=result^i;
            }
        }
        for(int i:nums2)
        {
            if(n%2==1)
            {
                result=result^i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1={2,1,3};
        int[] nums2={10,2,5,0};

        System.out.println(xorAllNums(nums1,nums2));
    }
}
