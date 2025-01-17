package SlidingWindow.Variable;

import java.util.HashMap;
import java.util.Map;

public class PickToys {

    public static int getMaxToys(String str,int k) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        while (j < str.length()) {
            if (!map.containsKey(str.charAt(j))) {
                map.put(str.charAt(j), 1);
            } else {
                map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
            }

            if(map.size()<k)
            {
                j++;
            }
            else if(map.size()==k)
            {
                max=Math.max(max,j-i+1);
                j++;
            }
            else
            {
                while (map.size()>k)
                {
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==0)
                    {
                        map.remove(str.charAt(i));
                    }
                    i++;
                }
                j++;
            }


        }
        return max;
    }
    public static void main(String[] args) {
        String str="abaccab";
        System.out.println(getMaxToys(str,2));
    }
}
