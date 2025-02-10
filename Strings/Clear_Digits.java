package Strings;

public class Clear_Digits {

    public static String clearDigits(String s) {

       StringBuilder res=new StringBuilder();
       int i=0;
       while (i<s.length())
       {
           char ch=s.charAt(i);
           if(Character.isLetter(ch))
           {
               res.append(ch);
           }
           else
           {
               res.deleteCharAt(res.length()-1);
           }
           i++;
       }

        return res.toString();
    }

    public static void main(String[] args) {


        System.out.println(clearDigits("abc54"));

    }
}
