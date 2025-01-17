package March;

import java.util.HashMap;
import java.util.Map;

public class D11_CustomSortString {

    public static String customSortString(String order, String s) {

        Map<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!hashMap.containsKey(s.charAt(i)))
            {
                hashMap.put(s.charAt(i),1);
            }
            else
            {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
        }
        StringBuilder sb=new StringBuilder("");



        for(int i=0;i<order.length();i++)
        {
            if(hashMap.containsKey(order.charAt(i)))
            {
                for(int j=0;j<hashMap.get(order.charAt(i));j++)
                {
                    sb.append(order.charAt(i));
                }
                hashMap.remove(order.charAt(i));
            }
        }
        for (Character c: hashMap.keySet())
        {
            for(int j=0;j<hashMap.get(c);j++)
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String order="hucw";
        String s="utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh";
        System.out.println(customSortString(order,s));
    }
}
