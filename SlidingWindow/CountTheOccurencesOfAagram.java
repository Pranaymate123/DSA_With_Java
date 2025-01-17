package SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTheOccurencesOfAagram {
    public static int getCount(String str,String p)
    {
        //store the complte p in map
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            if(!map.containsKey(p.charAt(i)))
            {
                map.put(p.charAt(i),1);
            }
            else {
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
            }
        }

        int i=0;
        int j=0;
        int count=map.size();
        int ans=0;
        int k=p.length();   //window size
        while (j<str.length())
        {
            if(map.containsKey(str.charAt(j))) {
                //-- the count of that letter
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);

                if (map.get(str.charAt(j)) == 0) {
                    //agar us letter ka count zero hota hai toh count --
                    count--;
                }
            }
            if(j-i+1 < k)
            {
                //++ window size
                j++;
            }
            else if(j-i+1==k)
            {
                if(count==0)
                {

                    ans++;
                }
                //slide the window
                //for i side
                if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);

                    if(map.get(str.charAt(i))==1)
                    {
                        count++;
                    }
                }
                i++;
                j++;
            }

        }

        return ans;
    }
    public static List<Integer> getListOfIndexes(String str, String p)
    {
        //store the complte p in map
        List<Integer> ansList=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            if(!map.containsKey(p.charAt(i)))
            {
                map.put(p.charAt(i),1);
            }
            else {
                map.put(p.charAt(i),map.get(p.charAt(i))+1);
            }
        }

        int i=0;
        int j=0;
        int count=map.size();

        int k=p.length();   //window size
        while (j<str.length())
        {
            if(map.containsKey(str.charAt(j))) {
                //-- the count of that letter
                map.put(str.charAt(j), map.get(str.charAt(j)) - 1);

                if (map.get(str.charAt(j)) == 0) {
                    //agar us letter ka count zero hota hai toh count --
                    count--;
                }
            }
            if(j-i+1 < k)
            {
                //++ window size
                j++;
            }
            else if(j-i+1==k)
            {
                if(count==0)
                {
                    ansList.add(i);

                }
                //slide the window
                //for i side
                if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);

                    if(map.get(str.charAt(i))==1)
                    {
                        count++;
                    }
                }
                i++;
                j++;
            }

        }

        return ansList;
    }

    public static void main(String[] args) {
        String str="abab";
        String p="ab";
//        System.out.println(getCount(str,p));
        System.out.println(getListOfIndexes(str,p));
    }
}
