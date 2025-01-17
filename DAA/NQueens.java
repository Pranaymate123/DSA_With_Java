package DAA;

public class NQueens {
    private int n;
    private int[][] board;

    public NQueens(int n) {
        this.n = n;
        this.board = new int[n][n];
    }

    // Function to check if placing a queen at board[row][col] is safe
    private boolean isSafe(int row, int col) {
        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Backtracking function to solve the N-Queens problem
    private boolean solveNQueens(int row) {
        if (row == n) { // All queens are placed
            printBoard();
            return true; // Return true to stop after finding the first solution
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col))
            {
                board[row][col] = 1; // Place queen

                if (solveNQueens(row + 1)) { // Recursive call for the next row
                    return true; // Stop once the first solution is found
                }

                board[row][col] = 0; // Backtrack if placing queen here doesn't lead to a solution
            }
        }
        return false; // No valid solution in this configuration
    }

    // Function to print the board
    private void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 1 ? "Q " : ". "));
            }
            System.out.println();
        }
        System.out.println();
    }

    // Public method to start solving the N-Queens problem
    public void solve() {
        if (!solveNQueens(0)) {
            System.out.println("No solution exists.");
        }
    }

    public static void main(String[] args) {
        int n = 8; // Set the desired value of N
        NQueens queens = new NQueens(n);
        queens.solve();
    }
}
