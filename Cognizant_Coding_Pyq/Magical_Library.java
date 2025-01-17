package Cognizant_Coding_Pyq;

public class  Magical_Library {

    //given the 2d book shelf and you have to return the count of magical rows that menas the sum of odd elements must be even

    public static int getCountOfMagicalBookShelf(int[][] arr)
    {
        int countOdd;
        int magicalRows=0;
        for(int i=0;i<arr.length;i++)
        {
            countOdd=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]%2==1)
                {
                    countOdd++;
                }
            }
            if( countOdd!=0 && countOdd%2==0)
            {
                magicalRows++;
            }
        }
        return magicalRows;
    }
    public static void main(String[] args) {
        int[][] arr = {{2,4}, {0,0}, {11,11}};

        System.out.println(getCountOfMagicalBookShelf(arr));
    }
}
