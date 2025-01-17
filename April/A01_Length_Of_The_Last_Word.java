package April;

public class A01_Length_Of_The_Last_Word {

    public static int lengthOfLastWord(String s) {
        int cnt=0;
        int j=s.length()-1;
        while (s.charAt(j)==' ')
        {
            j--;
        }
        while (s.charAt(j)!=' ')
        {
            cnt++;
            j--;
        }
        return cnt;
    }
    public static void main(String[] args) {
        String s="   fly me   to   the moon    ";
        System.out.println(lengthOfLastWord(s));
    }
}
