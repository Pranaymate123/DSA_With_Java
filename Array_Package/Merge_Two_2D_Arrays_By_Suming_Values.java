package Array_Package;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Merge_Two_2D_Arrays_By_Suming_Values {


    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        Map<Integer,Integer> map=new TreeMap<>();
        for(int[] n:nums1)
        {
            map.put(n[0],map.getOrDefault(n[0],0)+n[1]);
        }

        for(int[] n:nums2)
        {
            map.put(n[0],map.getOrDefault(n[0],0)+n[1]);
        }
        int[][] ans=new int[map.size()][2];
        int i=0;
        for (Integer key:map.keySet())
        {
            ans[i][0]=key;
            ans[i][1]=map.get(key);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
