package March;

public class D05_MinimumStringLength {
    public static int minimumLength(String s) {
        if(s.length()<1) return 0;
        int i=0;
        int j=s.length()-1;
        while (i<j && s.charAt(i)==s.charAt(j))
        {
            char ch=s.charAt(i);
            while (i<=j  && s.charAt(i)==ch )
            {
                i++;
            }

            while (i<=j && s.charAt(j)==ch)
            {
                j--;
            }
        }
        return j-i+1;
    }
    public static void main(String[] args) {
        String str="abbccabaa";
        System.out.println(minimumLength(str));
    }
}
