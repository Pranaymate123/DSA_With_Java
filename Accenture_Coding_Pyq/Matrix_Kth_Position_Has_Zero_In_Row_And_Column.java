package Accenture_Coding_Pyq;

public class Matrix_Kth_Position_Has_Zero_In_Row_And_Column {

    public static int getValueOfKthPosition(int [][] matrix)
    {
        int n=matrix.length;
        int row=0;
        int column=0;
        boolean flag=false;
        while(row<n && column<n)
        {
            flag=false;
            for(int i=0;i<n;i++)
            {
                if(i!=row && (matrix[row][i]!=0 || matrix[i][column]!=0))
                {
                    flag=true;
                    break;
                }
            }
            if(!flag) return row;
            row++;
            column++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,0,6,0,4},
                        {0,2,0,0,0},
                        {4,0,1,0,2},
                        {0,0,0,0,0},
                        {8,0,7,0,4}};
        System.out.println(getValueOfKthPosition(matrix));
    }
}
