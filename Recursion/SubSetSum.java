package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSum {

    public static void getSubSetSums(int idx, ArrayList<Integer> arr, int sum,  List<Integer> ans)
    {
        if(idx==arr.size())
        {
            ans.add(sum);
            return;
        }

        //pick it
       getSubSetSums(idx + 1, arr, sum + arr.get(idx), ans);
      //not pick it
       getSubSetSums(idx+1,arr,sum,ans);
    }

    static List<Integer> isSubsetSum(int N, ArrayList<Integer> arr){
        List<Integer> ans=new ArrayList<>();
       getSubSetSums(0,arr,0,ans);
       Collections.sort(ans);
       return ans;

    }

    public static void main(String[] args) {
            ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        System.out.println(isSubsetSum(arr.size(),arr));
    }
}
