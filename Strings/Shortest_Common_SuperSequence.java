package Strings;

public class Shortest_Common_SuperSequence {

    public static String shortestCommonSupersequence(String str1, String str2) {

        String result= str1.length() > str2.length() ? str1 : str2;
        if(result.contains(str1) && result.contains(str2))
            return result;

        StringBuilder temp=new StringBuilder();

        if(str1.length() <= str2.length())
        {
            temp.append(str1);
        }
        else {
            temp.append(str2);
        }
        int i=0;
        int j=0;
        //Trying to place smaller at start
        while (i<result.length() && j<temp.length() ) {
            char ch1 = result.charAt(i);
            char ch2 = temp.charAt(j);

            if (ch1 != ch2)
            {
                j++;
            }
            else
            {
                i++;
                j++;
            }
        }
        StringBuilder ans1=new StringBuilder();
        ans1.append(temp);
        ans1.append(result.substring(i));

        //Trying to place at end
        i=0;
        j=0;
        while (i<result.length() && j<temp.length() ) {
            char ch1 = result.charAt(i);
            char ch2 = temp.charAt(j);

            if (ch1 != ch2)
            {
                i++;
            }
            else
            {
                i++;
                j++;
            }
        }
        StringBuilder ans2= new StringBuilder();
        ans2.append(result);
        ans2.append(temp.substring(j));

        return ans1.length()<=ans2.length()?ans1.toString():ans2.toString();

    }

    public static void main(String[] args) {
        String str1="abac";
        String str2="cab";


        System.out.println(shortestCommonSupersequence(str1,str2));
    }
}
