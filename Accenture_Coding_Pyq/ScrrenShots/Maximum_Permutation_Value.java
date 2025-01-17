package Accenture_Coding_Pyq.ScrrenShots;

public class Maximum_Permutation_Value {

    public static int getMaxPermuteValue(String[] arr)
    {
        int maxP=0;
        for(String str:arr)
        {
            int cnt=getCountOfVowels(str);
            maxP=Math.max(maxP,getFactorial(cnt));
        }

        return maxP;
    }

    public static int getCountOfVowels(String str)
    {
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(!isVowel(str.charAt(i)))
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        return  (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public static int getFactorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }



    public static void main(String[] args) {
        String[] arr={"Aeiou","bcgfd","pjklmndfo"};
        System.out.println(getMaxPermuteValue(arr));

    }
}
