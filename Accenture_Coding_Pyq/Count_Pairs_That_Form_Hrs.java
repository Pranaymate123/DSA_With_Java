package Accenture_Coding_Pyq;

import java.util.HashMap;
import java.util.Map;

public class Count_Pairs_That_Form_Hrs {

    public static int getPairOfHrs(int [] arr)
    {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int mod=arr[i]%60;
            if(map.containsKey(60-mod) && map.get(60-mod)>0)
            {
                count++;
                map.put(60-mod,map.get(60-mod)-1);
            } else if (mod==0) {
                map.put(60,map.getOrDefault(60,0)+1);
            } else
            {
                map.put(mod,map.getOrDefault(mod,0)+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr={20, 40, 60, 80, 30, 90, 150, 180};
        System.out.println(getPairOfHrs(arr));
    }
}
