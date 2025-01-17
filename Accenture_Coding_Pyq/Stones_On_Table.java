package Accenture_Coding_Pyq;

public class Stones_On_Table {

    public static int getAns(String str)
    {
        int cnt=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(getAns("RRRGBR"));
    }
}
