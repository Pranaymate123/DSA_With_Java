package Accenture_Coding_Pyq;

public class ColourFull_Stones {

    public static int getPosition(String str,String t)
    {
        int i=0;
        int j=0;
        while (j<t.length() && i<str.length())
        {
            char ch1=str.charAt(i);
            char ch2=t.charAt(j);
            if(ch1==ch2)
            {
                i++;
            }
            j++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        System.out.println(getPosition("RRRBGBRBBB","BBBR"));
    }
}
