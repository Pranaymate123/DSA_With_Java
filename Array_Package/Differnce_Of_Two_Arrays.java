package Array_Package;
import java.util.*;
public class Differnce_Of_Two_Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> hash1=new HashSet<>();
        Set<Integer> hash2=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        for(int it: nums1)
        {
            hash1.add(it);
        }
        for(int it: nums2)
        {
            hash2.add(it);
        }
        List<Integer> ds1=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(hash1.contains(nums1[i]) && !hash2.contains(nums1[i]))
            {
                if(!ds1.contains(nums1[i]))
                    ds1.add(nums1[i]);
            }
        }
        res.add(ds1);

        List<Integer> ds2=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(hash2.contains(nums2[i]) && !hash1.contains(nums2[i]))
            {
                if(!ds2.contains(nums2[i]))
                    ds2.add(nums2[i]);
            }
        }
        res.add(ds2);



        return res;
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,3};
        int[] nums2={1,1,2,2};
        System.out.println(findDifference(nums1,nums2));
    }
}
