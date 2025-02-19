package Backtracking_CodeStoryWithMik;

public class The_kth_Lexicographical_String_of_All_Happy_Strings_Of_Length_N {

    int count=1;
    String result="";
    boolean flag=false;  // This is used to stop the recursive calls to generate the remaining happy strings once getting the kth happy String
    public String getHappyString(int n, int k) {

        solve(new StringBuilder(),k,n);
        return result;
    }

    public  void solve(StringBuilder curr,int k,int n)
    {
        if(curr.length()==n)
        {
           if(count==k)
           {
               result=curr.toString();
               flag=true;
           }
           count++;
            return;
        }
        for(char c='a';c<='c';c++)
        {
            if( !flag && (curr.length()==0 || curr.charAt(curr.length()-1)!=c))
            {
                curr.append(c);
                solve(curr,k,n);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }

    public static void main(String[] args) {

        The_kth_Lexicographical_String_of_All_Happy_Strings_Of_Length_N obj=new The_kth_Lexicographical_String_of_All_Happy_Strings_Of_Length_N();
        System.out.println(obj.getHappyString(3,9));

    }
}
