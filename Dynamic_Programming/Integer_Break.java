package Dynamic_Programming;

public class Integer_Break {

    public static int getMaxProduct(int n)
    {
        if(n%3==0) return (int) Math.pow(3,n/3);

        if(n%3==1) return (int)Math.pow(3,(n/3)-1) * 4;

        if(n%3==2) return (int)Math.pow(3,n/3) * 2;

        return -1;
    }



    public static void main(String[] args) {
        System.out.println(getMaxProduct(10));
    }
}
