package Accenture_Revision;

public class NumberOfCarries {
    public static int getNumberOfCarries(int num1,int num2)
    {
        int count=0;
        int carry=0;
        while(num1 !=0 && num2 !=0)
        {
            int rem1=num1%10;
            int rem2=num2%10;
            int sum=carry+rem1+rem2;
            if(sum>9)
            {
                count++;
                carry=sum/10;
            }
            num1=num1/10;
            num2=num2/10;
        }
        while (num1>0 && carry>0)
        {
            int rem=num1%10;
            count++;
            carry=(rem+carry)/10;
            num1=num1/10;
        }

        while (num2>0 && carry>0)
        {
            int rem=num2%10;
            count++;
            carry=(rem+carry)/10;
            num2=num2/10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getNumberOfCarries(999999,9));
    }
}
