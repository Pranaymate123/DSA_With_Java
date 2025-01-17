package Backtracking_CodeStoryWithMik;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Number_Of_Beautiful_Subsets {

    int result=0;
    public int beautifulSubsets(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        solve(nums,0,k,map);
        return result-1;  // minus for the empty set
    }

    public void solve(int[] nums, int idx, int k, Map<Integer,Integer> map)
    {

        if(idx==nums.length)
        {
            result++;
            return;
        }

        //not Take
        solve(nums,idx+1,k,map);

        //take
        if(!map.containsKey(nums[idx]+k) && !map.containsKey(nums[idx]-k))
        {
            map.put(nums[idx],map.getOrDefault(nums[idx],0)+1);

            solve(nums,idx+1,k,map);

            map.put(nums[idx],map.get(nums[idx])-1);

            // remove the key if count gets to zero
            if(map.get(nums[idx])==0)
            {
                map.remove(nums[idx]);
            }
        }
    }

  

    public static void main(String[] args) {
        int[] nums={2,4,6};
        Number_Of_Beautiful_Subsets obj=new Number_Of_Beautiful_Subsets();

        System.out.println(obj.beautifulSubsets(nums,2));
    }
}
