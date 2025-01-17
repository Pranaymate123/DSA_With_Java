package Revision.Array;

public class Reverse_String_II {

    public static String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=0;
        while (right<arr.length && k<arr.length)
        {
            if(right==left+k-1)
            {
                reverse(arr,left,right);
                left=left+2*k;
                right=left;
            }
            right++;
        }
        StringBuilder result=new StringBuilder();
       if(k>=arr.length)
       {
           reverse(arr,0,arr.length-1);
       }
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
        String str="abcd";
        System.out.println(reverseStr(str,4));
    }
}
