package Accenture_Revision;

public class Replace_All_Occurences_Of_Ch1_By_Ch2 {

    public static String getResult(String str,char ch1,char ch2)
    {
        StringBuilder result=new StringBuilder();
        for(char c:str.toCharArray())
        {
            if(ch1==c) result.append(ch2);
            else if
            (ch2==c) result.append(ch1);
            else result.append(c);

        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(getResult("pranay",'a','y'));
    }
}
