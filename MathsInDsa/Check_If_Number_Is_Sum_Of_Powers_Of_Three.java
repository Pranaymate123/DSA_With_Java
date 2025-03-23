package MathsInDsa;

public class Check_If_Number_Is_Sum_Of_Powers_Of_Three {


    public static boolean checkPowersOfThree(int n) {
       int p=0;
       while (Math.pow(3,p)<n)
       {
           p++;
       }

       while (n>0)
       {
           if(n>=Math.pow(3,p))
           {
               n=n-(int)Math.pow(3,p);
           }

           if(n>=Math.pow(3,p))
           {
               return false;
           }
           p--;
       }

       return n==0;
    }
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(91));
    }
}
