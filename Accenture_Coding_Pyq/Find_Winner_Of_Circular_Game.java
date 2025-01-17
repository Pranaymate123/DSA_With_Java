package Accenture_Coding_Pyq;

public class Find_Winner_Of_Circular_Game {

    public static int findTheWinner(int n, int k) {
        int winner=1;
        for(int i=2;i<=n;i++)
        {
            winner=(winner+(k-1))%i+1;
        }
        return winner;
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5,3));
    }
}
