package Recursion;

public class FibbonaciiNumber {

    public static int Fibbo(int n)
    {

        if(n<=1) return n;

        return Fibbo(n-1) + Fibbo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Fibbo(50));
    }
}
