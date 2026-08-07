package Patterns_Based_Questions.Binary_Search;

public class Search_A_2D_Matrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int start =0;
        int end = (rows * cols)-1;

        while (start<=end)
        {
            int mid = start + (end-start)/2;

            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col] > target)
            {
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
            int[][] matrix ={{1,3,5,7} , {10,11,16,20} , {23,30,34,60}};

        System.out.println(searchMatrix(matrix,300));
    }
}
