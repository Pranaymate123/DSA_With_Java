package Patterns_Based_Questions.Two_Pointers_And_Sliding_Window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {




    public static List<List<Integer>> threeSum(int[] nums) {


        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        //( n2+ n3) == -(n1)



        int i=0;
        int j=n-1;

       for(int n1=0;n1<n;n1++)
        {
            if (n1>0 && nums[n1]==nums[n1-1])
            {
                continue;
            }
            i=n1+1;
            j=n-1;
            int target = -1 * (nums[n1]);

            while(i<j)
            {

                int sum = nums[i] + nums[j];

                if(sum==target)
                {
                    result.add(List.of(nums[n1],nums[i], nums[j]));
                    while (i<j && nums[j]==nums[j-1])
                    {
                        j--;
                    }
                    while (i<j && nums[i]==nums[i+1])
                    {
                        i++;
                    }
                    i++;
                    j--;
                }
                else if(sum>target)
                {
                    j--;
                }
                else{
                    i++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4,0,2};
        System.out.println(threeSum(nums));
    }
}
