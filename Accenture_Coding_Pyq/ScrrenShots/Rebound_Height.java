package Accenture_Coding_Pyq.ScrrenShots;

public class Rebound_Height {

    public static int getReboundHeight(int H,int u,int v)
    {
        return (int) (H*(u/v)*(u/v));
    }

    public static void main(String[] args) {
        System.out.println(getReboundHeight(10,20,5));
    }
}
