package Accenture_Coding_Pyq;

public class Decode_Binary_String {
    public static String getDecodedString(String str)
    {
        StringBuilder result=new StringBuilder();
        char [] arr=new char[27];
        char ch='A';
        for(int i=1;i<27;i++)
        {
            arr[i]=ch;
            ch++;
        }
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0')
            {
                result.append(arr[cnt]);
                cnt=0;
            }
            else {
                cnt++;
            }
        }
        result.append(arr[cnt]);
        return result.toString();
    }

    public static void main(String[] args) {
        String str="10111011";
        System.out.println(getDecodedString(str));
    }
}
