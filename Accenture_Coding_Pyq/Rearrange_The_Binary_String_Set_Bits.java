package Accenture_Coding_Pyq;

public class Rearrange_The_Binary_String_Set_Bits {

    public static int getBinaryMinimumWithRearrangingSetBits(String str)
    {
        int cnt=0;
        int ans= 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='1')
            {
                cnt++;
            }
        }
        for(int i=0;i<cnt;i++)
        {
            ans=ans+(int)Math.pow(2,i);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getBinaryMinimumWithRearrangingSetBits("1010"));
    }
}
