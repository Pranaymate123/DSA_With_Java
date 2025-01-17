package Strings;

public class Move_Pieces_To_Obtain_A_String {

    public static boolean canChange(String start, String target) {
        int i=0;
        int j=0;
        int n=start.length();
        while (i<n || j<n)
        {
            while (i<n && start.charAt(i)=='_')
            {
                i++;
            }
            while (j<n && target.charAt(j)=='_')
            {
                j++;
            }
            if(i==n || j==n)
            {
                return i==n && j==n;
            }
            if(start.charAt(i)!=target.charAt(j)) return false;

            if(start.charAt(i)=='L' && i<j) return false;

            if(start.charAt(i)=='R' && i>j) return false;
            i++;
            j++;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canChange("_L__R__R_","L______RR"));
    }
}
