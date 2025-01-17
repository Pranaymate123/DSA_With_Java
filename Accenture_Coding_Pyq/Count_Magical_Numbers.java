package Accenture_Coding_Pyq;

public class Count_Magical_Numbers {

    public static int getCountOfMagicalNumbers(int n)
    {
        int res=0;
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            String bin=Integer.toBinaryString(i);
            int countZero=0;
            for(int j=0;j<bin.length();j++)
            {
                if(bin.charAt(j)=='0')
                    countZero++;

            }

            if(countZero%2==1) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(getCountOfMagicalNumbers(5));
    }
}
