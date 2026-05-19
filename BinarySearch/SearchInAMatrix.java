package BinarySearch;

public class SearchInAMatrix {


    public static boolean searchMatrix(int[][] matrix, int target) {


        int rows = matrix.length;
        int cols = matrix[0].length;
        int i=0;
        int j=cols-1;

        while (i<rows && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
            }
            else if(matrix[i][j]>target)
            {
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7} ,{10,11,16,20} ,{23,30,34,60}};

        System.out.println(searchMatrix(matrix,13));
    }
}
