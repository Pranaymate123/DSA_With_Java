package Recursion;

public class FriendsPairing {

    public static int friendsPairing(int n)
    {
        if (n<1)
        {
            return 1;
        }
        return friendsPairing(n-1 )+ (n-1) * friendsPairing(n-2);
    }

    public static void main(String[] args) {
        System.out.println(friendsPairing(50));
    }
}
