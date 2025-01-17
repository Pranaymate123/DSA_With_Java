package Cognizant_Coding_Pyq;

public class Ideal_String {

    //String given like XYXYXYXYXYXXYXXXY we need to make it XYXYXYXYXY
    //one x one y in this order So whatis the no. of operations we need to perform
    public static int getCountOfRemoveOperations(String str)
    {
        int ans=0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                ans++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        String str="XYXXYXXY";
        System.out.println(getCountOfRemoveOperations(str));
    }
}
