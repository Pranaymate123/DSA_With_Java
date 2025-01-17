package Accenture_Coding_Pyq;

public class Floyds_Pattern {

    public static void printFloydsPattern(int n) {
        for (int i = 1; i <= n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printFloydsPattern(60);
    }
}
