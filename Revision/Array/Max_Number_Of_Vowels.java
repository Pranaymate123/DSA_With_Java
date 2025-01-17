package Revision.Array;

public class Max_Number_Of_Vowels {

    public static int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int vowels=0;
        int max=Integer.MIN_VALUE;
        while (k>0)
        {
            if(isVowel(s.charAt(j)))
            {
                vowels++;
            }
            j++;
            k--;
        }
        max=vowels;
        while (j<s.length())
        {
              if(isVowel(s.charAt(j))){
                  vowels++;
                  j++;
              }
              else
              {
                  j++;
              }
              if(isVowel(s.charAt(i)))
              {
                  vowels--;
                  i++;
              }
              else
              {
                  i++;
              }
              max=Math.max(vowels,max);
        }
        return max;
    }

    public static boolean isVowel(char c)
    {
        return  (c=='a' || c=='e' || c=='o' || c=='i' || c=='u');
    }

    public static void main(String[] args) {
        String s="bcdgf";
        System.out.println(maxVowels(s,5));
    }
}
