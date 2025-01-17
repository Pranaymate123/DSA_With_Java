package Accenture_Coding_Pyq;

public class Replace_Zeros_With_Fives {

    public static int replace(int n)
    {
        String str=""+n;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                res.append('5');
            }
            else
            {
                res.append(str.charAt(i));
            }
        }
        return Integer.parseInt(res.toString());
    }
    public static void main(String[] args) {
        int n=100067;

        System.out.println(replace(n));
    }
}
