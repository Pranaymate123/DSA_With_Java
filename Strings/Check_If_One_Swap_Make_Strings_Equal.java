package Strings;

public class Check_If_One_Swap_Make_Strings_Equal {

    public static boolean areAlmostEqual(String s1, String s2) {

        int n=s1.length();
        int misPlacedChars=0;
        char[] s1MisplacedChars=new char[2];
        char[] s2MisplacedChars=new char[2];
        int j=0;
        for(int i=0;i<n;i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);

            if(ch1!=ch2)
            {
                misPlacedChars++;
                if(misPlacedChars>2)
                {
                    return false;
                }
                s1MisplacedChars[j]=ch1;
                s2MisplacedChars[j]=ch2;
                j++;

            }

        }
        return s1MisplacedChars[0] == s2MisplacedChars[1] && s1MisplacedChars[1] == s2MisplacedChars[0];
    }


    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank","kanb"));
    }
}
