package Accenture_Coding_Pyq;

public class Repeat_The_String {

    public static String getResultString(String s,int k)
    {
        StringBuilder result=new StringBuilder();
        for(int i=0;i<k;i++)
        {
            result.append(s);
        }
            return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(getResultString("ABC",3));
    }
}
