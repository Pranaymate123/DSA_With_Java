package Strings;

import java.util.HashMap;
import java.util.Map;


class  Pair<T,K>{
    T ch;
    K count;

    public Pair(T ch, K count) {
        this.ch = ch;
        this.count = count;
    }
}
public class Longest_Special_SubStrings_That_Occurs_Thrice {

    public  static int maximumLength(String s) {

        Map<Pair<Character,Integer>,Integer> map=new HashMap<>();
        int count;
        for(int i=0;i<s.length();i++)
        {
             count=0;
             char ch=s.charAt(i);

            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                    Pair pair=new Pair(ch,count);
                    map.put(pair,map.getOrDefault(pair,0)+1);

                }
                else
                {
                    break;
                }

            }
        }
        int maxLen=-1;
        for(Map.Entry<Pair<Character,Integer>,Integer> entry:map.entrySet())
        {
            int length=entry.getKey().count;
            if(entry.getValue()>=3 && length>maxLen)
            {
                maxLen=length;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(maximumLength("cccerrrecdcdccedecdcccddeeeddcdcddedccdceeedccecde"));
    }
}
