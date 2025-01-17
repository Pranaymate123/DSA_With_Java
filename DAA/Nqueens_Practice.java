package DAA;


public class Nqueens_Practice {
//
//   private int n;
//   private int[][] board;
//
//    public Nqueens_Practice(int n, int[][] board) {
//        this.n = n;
//        this.board = board;
//    }
//
//    public boolean isSafe(int row,int col)
//    {
//        //check column
//        for(int i=0;i<row;i++)
//        {
//            if(board[i][col]==1)
//            {
//                return false;
//            }
//        }
//
//        // check upper left Diagonal
//        for(int i = row , j=col; i>=0 && j >=0; i--,j--)
//        {
//            if(board[i][j]==1)
//            {
//                return false;
//            }
//        }
//
//        //check for the Upper Right Diagonal
//
//        for(int i=row, j=col; i>=0 && j<n;i--,j++)
//        {
//            if(board[i][j]==1)
//            {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public  boolean solveNQueens(int row)
//    {
//        if(row==n)
//        {
//            printBoard();
//            return true;
//        }
//
//        for(int col=0;col<n;col++)
//        {
//            if(isSafe(row,col))
//            {
//                board[row][col]=1;
//
//                if(solveNQueens(row+1))
//                {
//                    return true;
//                }
//                //backtrack
//                board[row][col]=0;
//            }
//        }
//        return false;
//    }
//
//    public void printBoard()
//    {
//        for(int[] row:board)
//        {
//            for(int ele:row)
//            {
//                System.out.print((ele==1?"Q ":". "));
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//
//    public void solve()
//    {
//        if(!solveNQueens(0))
//        {
//            System.out.println("No Solution Exists for this configuration");
//        }
//    }


    private  int n;
    private int[][] board;

    public Nqueens_Practice(int n, int[][] board) {
        this.n = n;
        this.board = board;
    }

    public boolean isSafe(int row,int col)
    {
        //for column
        for(int i=0;i<n;i++)
        {
            if(board[i][col]==1) return false;

        }

        //for left upper diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(board[i][j]==1) return false;

        }

        //for right upper diagonal
        for(int i=row ,j=col;i>=0 && j<n;i--,j++)
        {
            if(board[i][j]==1) return false;
        }
        return true;
    }

    public boolean solveNQueens(int row)
    {
        if(row==n)
        {
            printBoard();
            return true;
        }
        for(int col=0;col<n;col++)
        {
            if(isSafe(row,col))
            {
                board[row][col]=1;
                if(solveNQueens(row+1))
                {
                    return true;
                }
                //back track  if above conddition fails

                board[row][col]=0;
            }
        }
        return false;
    }

    public void solve()
    {
        if(!solveNQueens(0))
        {
            System.out.println("No Soultion is possible for this input");
        }
    }

    public void printBoard()
    {
        for(int[] row:board)
        {
            for(int cell:row)
            {
                System.out.print((cell==1?"Q ":". "));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=8;
        int[][] board=new int[n][n];
        Nqueens_Practice nqueensPractice=new Nqueens_Practice(n,board);
        nqueensPractice.solve();
    }
}
