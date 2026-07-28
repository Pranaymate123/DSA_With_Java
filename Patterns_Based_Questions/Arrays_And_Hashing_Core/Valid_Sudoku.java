package Patterns_Based_Questions.Arrays_And_Hashing_Core;

import java.util.HashSet;
import java.util.Set;

public class Valid_Sudoku {
    public static boolean isValidSudoku(char[][] board) {

        //All rows check
        for (char[] row :board)
        {
            Set<Character> set = new HashSet<>();
            for(char c:row)
            {
                if(set.contains(c))
                {
                    return false;
                }
                else {
                    if (c != '.')
                    {
                        set.add(c);
                    }
                }
            }
        }
        //ALL columns Check

        for (int i=0;i<9;i++)
        {
            Set<Character> set = new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(set.contains(board[j][i]))
                {
                    return false;
                }
                else {
                    if(board[j][i]!='.')
                    {
                        set.add(board[j][i]);
                    }
                }
            }
        }

        //ALL 3X3 Boxes check
        //SO I NEED THE STARTING INDICES OF EACH BOXES
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                if(!isValidBox(i,j,board))
                {

                    return false;
                }
            }
        }


        return true;
    }

    public static boolean isValidBox(int i,int j,char[][] board)
    {
        Set<Character> set = new HashSet<>();

        for(int r=i;r<i+3;r++)
        {
            for(int c=j;c<j+3;c++)
            {
                if(set.contains(board[r][c]))
                {
                    return false;
                }
                else{
                    if(board[r][c]!='.')
                    {
                        set.add(board[r][c]);
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(board));
    }
}
