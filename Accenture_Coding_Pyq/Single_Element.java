package Accenture_Coding_Pyq;

public class Single_Element {

    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,4,3};
        System.out.println(getSingleElement(arr));
    }

    public static int getSingleElement(int[] arr)
    {
        int xor=0;
        for(int i:arr)
        {
            xor=xor^i;
        }
        return xor;
    }
}
