package Strings;

public class Add_Spaces_To_The_String {

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result=new StringBuilder();
        int i=0;
        int j=0;


        char[] arr=s.toCharArray();
        while (i<s.length() && j<spaces.length)
        {
            if(i==spaces[j])
            {
                result.append(' ');
                j++;
            }
            else {
                result.append(s.charAt(i));
                i++;
            }
        }
        result.append(s.substring(i));
        return result.toString();
    }

    public static void main(String[] args) {
        String str="spacing";
        int[] arr={0,1,2,3,4,5,6};
        System.out.println(addSpaces(str,arr));
    }
}
