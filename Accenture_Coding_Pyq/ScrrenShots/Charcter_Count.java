package Accenture_Coding_Pyq.ScrrenShots;

public class Charcter_Count {

    public static int getCountOfChar(String str)
    {
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='l')
            {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        String str="helloWorld";
        System.out.println(getCountOfChar(str));
    }
}
