package Accenture_Coding_Pyq;

public class Minimum_Number_Of_Purchases {

    public static int getMinNoOfPurchases(int N,int E,int D)
    {
        if(N==0) return -1;
        if(E==0 || D==0) return 0;
        if(N*6<7*E) return -1;
        if(D<7) return (D*E)%N==0 ? (D*E)/N:((D*E)/N)+1;



        int ans=0;
        //complete Weeks
        int weeks=D/7;

        ans=ans+(((weeks*E*7) % N==0)?(weeks*E*7)/N: ((weeks*E*7)/N)+1);

        int left=ans*N - weeks*E*7;

        //Remaining Days
        int days=D%7;
        int req=(days*E-left);
        ans=ans+((req%N==0)?req/N:(req/N)+1);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getMinNoOfPurchases(2,10,2));
    }
}
