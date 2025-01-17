package Recursion;

public class Power {

    public static int getNtoPowerX(int n,int pow)
    {
        if(pow==0)
            return 1;
        return  n * getNtoPowerX(n ,pow-1);
    }

    public static int optimizedPower(int n,int pow)
    {
        if(pow==0)
        {
            return 1;
        }
        int halfpower=optimizedPower(n,pow/2);
        int halfSolution=halfpower*halfpower;

        if (pow%2!=0)
        {
            halfSolution=halfSolution*n;
        }
        return halfSolution;
    }

    public static void main(String[] args) {
//        System.out.println(getNtoPowerX(2,10));
        System.out.println(optimizedPower(2,1));
    }
}
