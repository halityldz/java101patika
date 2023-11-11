import java.util.Scanner;

public class mayintarlasi {
    private int rows;
    private int cols;
    private int[][] board;
    private boolean[][] mineLocations;

    public mayintarlasi(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new int[rows][cols];
        this.mineLocations = new boolean[rows][cols];
        placeMines();
        fillBoard();
    }

    private void placeMines() {
        int totalMines = rows * cols / 4;
        for (int i = 0; i < totalMines; i++) {
            int randomRow, randomCol;
            do {
                randomRow = (int) (Math.random() * rows);
                randomCol = (int) (Math.random() * cols);
            } while (mineLocations[randomRow][randomCol]);
            mineLocations[randomRow][randomCol] = true;
        }
    }

    private void fillBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineLocations[i][j]) {
                    board[i][j] = -1; // -1 represents a mine
                } else {
                    board[i][j] = countSurroundingMines(i, j);
                }
            }
        }
    }

    private int countSurroundingMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidLocation(i, j) && mineLocations[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isValidLocation(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mineLocations[i][j]) {
                    System.out.print("* ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter row and column (separated by a space): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!isValidLocation(row, col)) {
                System.out.println("Invalid location. Please try again.");
                continue;
            }

            if (mineLocations[row][col]) {
                System.out.println("Game over! You hit a mine.");
                break;
            }

            revealCell(row, col);

            if (isGameWon()) {
                System.out.println("Congratulations! You won the game.");
                break;
            }

            printBoard();
        }

        scanner.close();
    }

    private void revealCell(int row, int col) {
        // Implement the logic to reveal the cell and update the board
        // You need to recursively reveal cells if the selected cell has 0 surrounding mines
    }

    private boolean isGameWon() {
        // Implement the logic to check if the game is won
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır Sayısını giriniz:  ");
        int rows = scanner.nextInt();

        System.out.print("Sütun sayısını giriniz:  ");
        int cols = scanner.nextInt();

        mayintarlasi game = new mayintarlasi(rows, cols);
        game.printBoard();
        game.playGame();

        scanner.close();
    }
}
