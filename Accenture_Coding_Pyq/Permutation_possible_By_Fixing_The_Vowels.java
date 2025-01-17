package Accenture_Coding_Pyq;
import java.util.HashSet;
import java.util.Set;
public class Permutation_possible_By_Fixing_The_Vowels {

    public static boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static int getFactorial(int n)
    {
        if(n==0) return 1;

        return n * getFactorial(n-1);
    }
    public static int getCountOfPermutations(String str)
    {
        Set<Character> set=new HashSet<>();
        int countUniqueVowels=0;
        int countConsonants=0;
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            arr[ch-'a']=arr[ch-'a']+1;
            if(isVowel(ch))
            {
                if(!set.contains(ch))
                {
                    set.add(ch);
                    countUniqueVowels++;
                }
            }
            else countConsonants++;
        }
        int divisor=1;
        for(int i=0;i<26;i++)
        {
            if(arr[i]>1)
            {
                divisor*=getFactorial(arr[i]);
            }
        }
        int ans=(getFactorial(countConsonants+1) * getFactorial(countUniqueVowels))/divisor;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getCountOfPermutations("abbc"));
    }
}
