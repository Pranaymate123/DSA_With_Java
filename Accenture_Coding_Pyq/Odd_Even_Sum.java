package Accenture_Coding_Pyq;

public class Odd_Even_Sum {

    public static void getAnswer(int dice,int num)
    {
        int sum1=0;
        int sum2=0;
        boolean flag=true;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            if(flag){
                sum1+=rem;
                flag=false;
            }
            else
            {
                sum2+=rem;
                flag=true;
            }
            num=num/10;
        }
        int oddSum=0;
        int evenSum=0;
        if(temp%2==0)
        {
            oddSum=sum1;
            evenSum=sum2;
            System.out.println("Odd Sum "+oddSum);
        }
        else
        {
            oddSum=sum2;
            evenSum=sum1;
            System.out.println("Even Sum "+evenSum);
        }

    }

    public static void main(String[] args) {
        int dice=2;
        int num=12345;
        getAnswer(dice,num);
    }
}
