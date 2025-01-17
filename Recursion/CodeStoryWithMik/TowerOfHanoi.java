package Recursion.CodeStoryWithMik;

public class TowerOfHanoi {

    public static int towerOfHanoi(int n, int from, int to, int aux) {

        if(n==0) return 0;

        if(n==1) return 1;

        int count=0;
        count=towerOfHanoi(n-1,from,aux,to);

//        System.out.println(" move disk " +n+" From Tower "+ from + " To Tower "+ aux+" With The Help Of "+ to);
        count++;

        count+=towerOfHanoi(n-1,aux,to,from);

        return count;
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(towerOfHanoi(n,0,0,0));
    }
}
