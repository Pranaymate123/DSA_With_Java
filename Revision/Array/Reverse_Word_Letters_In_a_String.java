package Revision.Array;

import java.util.Arrays;

public class Reverse_Word_Letters_In_a_String {

    public static String getReverseString(String str) {
        //Word remains at same position the only thing we have to do is we have to reverse the alphabets in words
        char[] arr=str.toCharArray();
        int left=0;
        int right=0;
        while (right<arr.length)
        {
            if(arr[right]==' ')
            {
                reverse(arr,left,right-1);
                left=right+1;
            }
            right++;
        }

        //for last word
        reverse(arr,left,right-1);
        StringBuilder result=new StringBuilder();
        for(char c:arr)
        {
            result.append(c);
        }
        return result.toString();

    }
    public static void reverse(char[] arr,int left,int right)
    {
        while (left<right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String str="i love u";
        System.out.println(str);
        System.out.println(getReverseString(str));
//        System.out.println(reverse("pranay",0,5));
    }
}
