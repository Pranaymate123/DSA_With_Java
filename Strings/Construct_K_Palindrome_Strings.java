package Strings;

public class Construct_K_Palindrome_Strings {

    public static boolean canConstruct(String s, int k) {

        int n=s.length();
        if(n==k) return true;
        if(n<k) return false;

        int[] arr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            arr[ch-'a']=arr[ch-'a']+1;
        }
        int cnt=0;
        for(int i=0;i<26;i++)
        {
            if(arr[i]%2==1)
            {
                cnt++;
            }
        }

        return cnt<=k;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("annabelle",2));
    }
}
