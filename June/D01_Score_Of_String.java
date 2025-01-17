package June;

public class D01_Score_Of_String {

    public static int scoreOfString(String s) {
        if(s.length() <=0) return 0;

        if(s.length() == 1) return  (int)s.charAt(0);
        int res=0;
        char []c=s.toCharArray();
        for(int i=0;i<s.length()-1;i++)
        {
            res=res+Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        return res;
    }
    public static void main(String[] args) {
       String s="hello";

        System.out.println(scoreOfString(s));
    }
}
