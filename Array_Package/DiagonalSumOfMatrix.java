package Array_Package;

public class DiagonalSumOfMatrix {

    public  static  int getDiagonalSumOfMatrix(int matrix[][])
    {
      int sum=0;
      for(int i=0;i<matrix.length;i++)
      {
          sum+=matrix[i][i];
          if(i!=matrix.length-1-i)
            sum+=matrix[i][matrix.length-1-i];
      }
      return sum;
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(getDiagonalSumOfMatrix(matrix));
    }
}
