package Accenture_Coding_Pyq;

public class Count_Spaces_Diff {

    public static void getAns(String str1,String str2)
    {
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)==' ')
            {
                cnt1++;
            }
        }
         for(int i=0;i<str2.length();i++)
        {
            if(str2.charAt(i)==' ')
            {
                cnt2++;
            }
        }

         int diff=Math.abs(cnt1-cnt2);
         if(diff%2==0)
         {
             System.out.println("Even : "+diff);
         }
         else {
             System.out.println("Odd : "+diff);
         }

    }
    public static void main(String[] args) {
        String str1="abc bdc bhb djjr";
        String str2="ab bf cg";
        getAns(str1,str2);
    }
}
