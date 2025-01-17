package Recursion.CodeStoryWithMik;

import java.util.ArrayList;
import java.util.List;

public class NQueens_Problem {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result=new ArrayList<>();
        if(n==0) return result;

        List<String> board=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            StringBuilder row=new StringBuilder();
            for(int j=0;j<n;j++)
            {
                row.append('.');
            }
            board.add(row.toString());
        }

        solve(result,board,0,n);

        return result;

    }

    public static void solve(List<List<String>> result,List<String> board,int row,int n)
    {
        if(row>=n)
        {
            result.add(new ArrayList<>(board));
            return;
        }
        for(int col=0;col<n;col++)
        {
            if(isSafe(board,row,col,n))
            {
                StringBuilder newRow=new StringBuilder(board.get(row));
                newRow.setCharAt(col,'Q');
                board.set(row, newRow.toString());

                solve(result,board,row+1,n);

                newRow.setCharAt(col,'.');
                board.set(row,newRow.toString());
            }
        }
    }

    public static boolean isSafe(List<String> board,int row,int col,int n)
    {
        for(int i=0;i<row;i++)
        {
            if(board.get(i).charAt(col)=='Q')
            {
                return false;
            }
        }

        for(int i=row,j=col;i>=0&&j>=0 ; i--,j--)
        {
            if(board.get(i).charAt(j)=='Q')
            {
                return false;
            }
        }

        for(int i=row,j=col;i>=0 && j<n;i--,j++)
        {
            if(board.get(i).charAt(j)=='Q')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        List<List<String>>  result= solveNQueens(4);

        for(List<String> board: result)
        {
            System.out.println(board);
        }
    }
}
