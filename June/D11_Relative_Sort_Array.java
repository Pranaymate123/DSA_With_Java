package June;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class D11_Relative_Sort_Array {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        int [] res=new int[arr1.length];
        Map<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(!map.containsKey(arr1[i]))
            {
                map.put(arr1[i],1);
            }
            else
            {
                map.put(arr1[i],map.get(arr1[i])+1);
            }
        }



        int k=0;
        for(int i=0;i<arr2.length;i++)
        {
            int num=map.get(arr2[i]);
            for(int j=0;j<num;j++)
            {
                res[k]=arr2[i];
                k++;
            }
            map.remove(arr2[i]);
        }
        for(int ele:map.keySet())
        {
            int num=map.get(ele);
            for(int j=0;j<num;j++)
            {
                res[k]=ele;
                k++;
            }
        }




        return res;
    }

    public static void main(String[] args) {

        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
//        output :: 2,2,2,1,4,3,3,9,6,7,19
        System.out.println(Arrays.toString(relativeSortArray(arr1,arr2)));
    }
}
