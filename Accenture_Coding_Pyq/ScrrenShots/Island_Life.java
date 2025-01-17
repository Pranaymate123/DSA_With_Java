package Accenture_Coding_Pyq.ScrrenShots;

public class Island_Life {

    public static int getMinimumNumberOfBoxToBuy(int N,int E,int D)
    {
        if(N==0) return -1;
        if(D==0 || E==0) return 0;
        if(7*E > 6*N ) return -1;
        if(D<7) return (D*E)%N==0?((D*E)/N):((D*E)/N)+1;


        int ans=0;
        //calculate the complete Weeks
        int weeks=D/7;
//        If the weeks requiremnt % N==0 toh requiremnt/N add karo else extra +1  bhi add karo
        ans+=((weeks*E*7)%N==0)?(weeks*E*7)/N : ((weeks*E*7)/N)+1;

        int left=ans*N-(weeks*E*7); // Jitna reuiremnt tha agr uuse jyada produce ya kharida hai toh left nikalo

        int days=D%7; //days nikalo

        int req=(days*E-left); // Days ki requiremnt Nikalo

        //        If the days requiremnt % N==0 toh requiremnt/N add karo else extra +1  bhi add karo

        ans+=req%N==0 ? (req/N):(req/N)+1;

        return ans;

        //ans return kardo

    }

    public static void main(String[] args) {
        System.out.println(getMinimumNumberOfBoxToBuy(1,10,2));
    }
}
