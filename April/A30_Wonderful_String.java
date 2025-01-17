package April;

import java.util.HashMap;
import java.util.Map;

public class A30_Wonderful_String {

    public static long wonderfulSubstrings(String word) {
        int count[]=new int[1024];
        int mask=0;
        count[0]=1;
        long result=0;
        for(char c: word.toCharArray())
        {
            mask ^=1 << (c-'a');
            result+=count[mask];
            for(int i=0;i<10;i++)
            {
                result+=count[mask^(1<<i)];
            }
            count[mask]++;
        }
        return result;
    }
    public static boolean isWonderFulString(Map<Character,Integer> map,int i,int j,String str)
    {
        if(j==i)
        {
            return true;
        }
        int cnt=0;
        for(int k=i;k<=j;k++)
        {
            if(map.get(str.charAt(k))%2!=0)
            {
                cnt++;
                if(cnt>1)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="igdfiiffachebfhgdefhf";
        System.out.println(wonderfulSubstrings(str));
    }
}
