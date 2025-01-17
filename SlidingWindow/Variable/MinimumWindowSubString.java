package SlidingWindow.Variable;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubString {
        public static String getMinimumWindowSubString(String str,String t)
    {

        String ans="";
        //store al the entries of the t in map
        Map<Character,Integer> map=new HashMap<>();
        for(int j=0;j<t.length();j++)
        {
            if(!map.containsKey(str.charAt(j)))
            {
                map.put(str.charAt(j),1);
            }else {
                map.put(str.charAt(j),map.get(str.charAt(j)) +1 );
            }
        }

        int i=0;
        int j=0;
        int startIndex=-1;
        int endIndex=-1;
        int min=Integer.MAX_VALUE;
        int count=map.size();
        while (j<str.length())
        {
            if(map.containsKey(str.charAt(j)))
            {
                map.put(str.charAt(j),map.get(str.charAt(j))-1);
                if(map.get(str.charAt(j))==0)
                {
                    count--;
                }
                j++;
            }else
            {
                j++;
            }
            if(count==0)
            {
                startIndex=i;
                endIndex=j;
                while (count==0)
                {

                    min=Math.min(min,j-i+1);

                    if(map.containsKey(str.charAt(i)))
                    {
                        map.put(str.charAt(i),map.get(str.charAt(i))+1);
                        if(map.get(str.charAt(i))==1)
                        {
                            count++;
                        }
                        i++;
                    }else
                    {
                        i++;
                    }
                    if(i>startIndex)
                    {
                        startIndex=i;
                    }
                }

                j++;
            }
        }
        System.out.println(min);
        System.out.println(startIndex + " "+ endIndex);
        return str.substring(startIndex,endIndex);
    }

    public static void main(String[] args) {
        String str="ADOBECODEBANC";
        String t="ABC";
        System.out.println(getMinimumWindowSubString(str,t));
    }
}
