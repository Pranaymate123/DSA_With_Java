package Accenture_Coding_Pyq;

public class Sum_Of_Elements_At_Prime_Index {

    public static boolean isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n!=i && n%i==0) return false;
        }
        return true;
    }

    public static int getSum(int[] arr)
    {
        int sum=0;
        for(int i=2;i<arr.length;i++)
        {
            if(isPrime(i))
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        System.out.println(getSum(arr));
    }
}
