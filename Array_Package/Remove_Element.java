package Array_Package;

import java.util.ArrayList;
import java.util.List;

public class Remove_Element {
//    public static int removeElement(int[] nums, int val) {
//        List<Integer>  tempLst=new ArrayList<>();
//        for(int num:nums)
//        {
//            if(num!=val)
//            {
//                tempLst.add(num);
//            }
//        }
//        for(int i=0;i<tempLst.size();i++)
//        {
//            nums[i]=tempLst.get(i);
//        }
//        return tempLst.size();
//    }
    public static int removeElement(int[] nums, int val) {
       int index=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]!=val)
           {
               nums[index]=nums[i];
               index++;
           }
       }
       return index;
    }
    public static void main(String[] args) {
        int []nums={3,3,5};
        System.out.println(removeElement(nums,5));

    }
}
