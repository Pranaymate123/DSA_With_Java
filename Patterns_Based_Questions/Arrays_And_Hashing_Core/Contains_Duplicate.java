package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int n:nums)
        {
            if(set.contains(n))
            {
                return true;
            }
            else{
                set.add(n);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,1};

        System.out.println(containsDuplicate(nums));
    }
}
