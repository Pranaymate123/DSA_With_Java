package Strings;

import java.util.Arrays;

public class Construct_The_String_With_Repeat_Limits {

    public static String repeatLimitedString(String s, int repeatLimit) {
        int[] arr=new int[26];
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']=arr[ch-'a']+1;
        }

//        System.out.println(Arrays.toString(arr));
        StringBuilder result=new StringBuilder();
        int i= arr.length-1;
        while (i>=0)
        {
            if(arr[i]>0)
            {
                int freq=arr[i];
                char ch= (char) ('a'+i);
                int repeatTime=Math.min(freq,repeatLimit);

//                System.out.println("char "+ch+ " Repeated Time "+ repeatTime);
                arr[i]=freq-repeatTime;
//                System.out.println(Arrays.toString(arr));
                while (repeatTime>0)
                {
                    result.append(ch);
                    repeatTime--;
                }
                if(arr[i]==0)
                {
                    i--;
//                    System.out.println("Called");
                }
                else {
                    int j=i-1;
                    while ( j>=0 &&  arr[j]==0)
                    {

                        j--;
                    }
                    if(j<0)
                    {
                        return result.toString();
                    }else
                    {
                        char ch1= (char) ( 'a'+j);
                        result.append(ch1);

                        arr[j]=arr[j]-1;
                    }
                }
            }
            else
            {
                i--;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str="cczazcc";
        System.out.println(repeatLimitedString(str,3));
    }
}
