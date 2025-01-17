package Cognizant_Coding_Pyq;

public class Password_Checker {

    public static String verifyPassword(String s1,String s2)
    {
        if(s1.equals(s2))
        {
            return s1+"_Verified";
        }
        return s1 + "_NotVerified";
    }

    public static void main(String[] args) {
        String s1="ABC123";
        String s2="ABC123";
        System.out.println(verifyPassword(s1,s2));
    }
}
