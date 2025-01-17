package Revision.Array;

import java.util.*;

public class Minimum_Pushes {

    public static int minimumPushes(String word) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
        }
        List<Integer> lst=new ArrayList<>();
        for(Character key:map.keySet())
        {
            lst.add(map.get(key));
        }
        lst.sort((a,b)->b-a);
//        System.out.println(lst);

        int i=0;
        int ans=0;
        int mf=1;
        int j=0;
        while (j<lst.size())
        {
            ans=ans+lst.get(j)*mf;
            if((j+1)%8==0)
            {
                mf++;
            }
            j++;

        }

        return ans;
    }
    public static void main(String[] args) {
//        String str="aabbccddeeffgghhiiiiiijjjjjj";
//        System.out.println(minimumPushes(str));
        String str="abcdefghijklmnopqrstuvwxyz";
        System.out.println(str.charAt(18));
        Integer [] arr={48,43,3,4,2,3};

        Arrays.sort(arr,(a,b)->b-a);
        System.out.println(Arrays.toString(arr));
    }
}
