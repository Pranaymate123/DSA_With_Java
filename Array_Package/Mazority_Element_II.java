package Array_Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mazority_Element_II {

    public static List<Integer> majorityElement(int[] nums) {
           int cnt1=0,cnt2=0;
           int ele1=0,ele2=0;

           List<Integer> result=new ArrayList<>();
           for(int i=0;i<nums.length;i++)
           {
               if(cnt1==0 && nums[i]!=ele2)
               {
                   cnt1=1;
                   ele1=nums[i];
               } else if (cnt2==0 && nums[i] !=ele1) {
                   cnt2 = 1;
                   ele2 = nums[i];
               } else if (ele1==nums[i]) {
                   cnt1++;
               } else if (ele2==nums[i]) {
                   cnt2++;

               }
               else
               {
                   cnt1--;
                   cnt2--;
               }
           }
           //Check the stored value
        int cnt11=0;
           int cnt22=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==ele1) cnt11++;
                else if (nums[i]==ele2) cnt22++;
            }

            if(cnt11>nums.length/3) result.add(ele1);
            if(cnt22>nums.length/3) result.add(ele2);

            return result;
    }


    public static int majorityElementNby2(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int ele=nums[0];
        for( int i:nums)
        {
            if(cnt==0)
            {
                cnt=1;
                ele=i;
            }
            else if(ele==i)
            {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        //to check the element we store is mazority or not
        int key=n/2;
        int cnt1=0;
        for(int i:nums)
        {
            if(i==ele)
            {
                cnt1++;
            }
        }
        if(cnt1>key) return ele;

        return -1;

    }
    public static void main(String[] args) {
        int [] nums={1,1,1,3,3,4,2,2};
//        System.out.println(majorityElement(nums));

        System.out.println(majorityElement(nums));
    }
}
