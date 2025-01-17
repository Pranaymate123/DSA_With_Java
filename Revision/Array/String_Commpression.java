package Revision.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class String_Commpression {

    public static int compress(char[] arr) {
        int i=0;
        int k=0;
        int freq=1;
        while (i<arr.length-1)
        {
            if(arr[i]==arr[i+1])
            {
                freq++;
            } else if (arr[i]!=arr[i+1]) {
                if(freq>1)
                {
                    arr[k]=arr[i];
                    k++;
                    String numbers=Integer.toString(freq);
                    for(int j=0;j<numbers.length();j++)
                    {
                        arr[k]=numbers.charAt(j);
                        k++;
                    }
                    freq=1;
                }
                else
                {
                    arr[k]=arr[i];
                    k++;
                }
            }
            i++;
        }
        if(freq>1)
        {
            arr[k]=arr[i];
            k++;
            String numbers=Integer.toString(freq);
            for(int j=0;j<numbers.length();j++)
            {
                arr[k]=numbers.charAt(j);
                k++;
            }
            freq=1;
        }
        else
        {
            arr[k]=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(arr));
        return k;

    }

    public static void main(String[] args) {
//        char[] arr={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
//        char [] arr={'a','a','b','b','c','c'};
//        char[] arr={'a','a','a','b','b','a','a'};
        char [] arr={'a'};
        System.out.println(compress(arr));
    }
}
