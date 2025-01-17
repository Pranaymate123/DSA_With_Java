package Revision.Array;

public class Vowels_Game_In_The_String {

    public static int maxOperations(String s) {

        int count=0;
        char[] arr=s.toCharArray();
        for(int i=arr.length-2;i >=0 ;i--)
        {

            if(arr[i]=='1')
            {
                if (arr[i+1]=='0')
                {
                    count++;
                    int j=i;
                    while (arr[j+1]=='0')
                    {


                        char temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        j++;
                    }
                }
            }
        }
        return count+1;
    }

    public boolean isVowel(char c)
    {
        return (c=='a'||c=='e' || c=='i' || c=='o' || c=='u');
    }
    public static void main(String[] args) {
        String str="1001101";
        System.out.println(maxOperations(str));
    }
}
