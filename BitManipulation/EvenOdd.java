package BitManipulation;

public class EvenOdd {
    public static String checkEvenOdd(int N)
    {
        if((N&1)==0)
        {
            return "even";
        }
        return  "odd";
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(5));
    }
}
