package Accenture_Coding_Pyq;

public class Maimum_No_Of_Char_In_K_Size_SubString {

    public static int getResult(String str,char ch,int k)
    {
        int maxCount=0;
        int cnt=0;
        int i=0;
        int j=0;

        while (j<str.length())
        {
            if (k>0)
            {
                if(str.charAt(j)==ch)
                {

                    cnt++;

                }
                k--;
                j++;
            }
            if(str.charAt(j)==ch) cnt++;
            if(str.charAt(i)==ch) cnt--;
            i++;
            j++;
            maxCount=Math.max(maxCount,cnt);

        }
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(getResult("acdbaaca",'a',3));
    }
}
