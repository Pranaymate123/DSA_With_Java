package Accenture_Coding_Pyq;

public class Most_Rhymed_String {

    public static String getMostRhymed(String[] arr,String target)
    {
        int maxResult=0;
        String result="";
        for(String str:arr)
        {
            int num=getCountOfSameSuffixChars(str,target);
            if(num>maxResult)
            {
                maxResult=num;
                result=str;
            } else if (num==maxResult) {
                result=str.length()>result.length()?result:str;
            }
        }
        return result;
    }

    public static  int getCountOfSameSuffixChars(String str1,String str2)
    {
        int n1=str1.length();
        int n2=str2.length();
        int i=n1-1;
        int j=n2-1;
        int cnt=0;
        while(i>=0 && j>=0)
        {
            if(str1.charAt(i)==str2.charAt(j))
            {
                cnt++;
                i--;
                j--;
            }
            else {
                break;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String[] arr={"gender","blender","blunder","under"};
        System.out.println(getMostRhymed(arr,"thunder"));

    }
}
