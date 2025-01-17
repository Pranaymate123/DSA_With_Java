package Accenture_Coding_Pyq;

public class String_With_Mixed_Bit_Wise_Operations {

    //A--> and
    //B---> Or
    //c--->Xor
    public static int simplify(String str)
    {
        int n=str.length();
        if(n==0) return 0;
        int ans=str.charAt(0)-'0';

        for(int i=1;i<n-1;i=i+2)
        {
            char operation=str.charAt(i);
            int b=str.charAt(i+1)-'0';

            if(operation=='A')
            {
                ans=ans & b;
            } else if (operation=='B') {
                ans=ans | b;
            }
            else
            {
                ans=ans^b;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="1C0C1C1A0B1";
        System.out.println(simplify(str));
    }
}
