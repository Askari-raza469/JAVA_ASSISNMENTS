import java.util.Scanner;

public class ASSIGN_01 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int[][] a = new int [3][3];  // 3x3 matrix


            System.out.println("Enter 9 numbers for 3x3 matrix:");
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    System.out.print("Enter element at [" + r + "][" + c + "]: ");
                    a[r][c] = sc.nextInt();
                }
            }
            boolean isMagicSquare = true;
            int magicSum = 0;
            // Calculate the magic sum (sum of the first row)
            for (int c = 0; c < a[0].length; c++) {
                magicSum += a[0][c];
            }
            // Check rows
            for (int r = 1; r < a.length; r++) {
                int rowSum = 0;
                for (int c = 0; c < a[r].length; c++) {
                    rowSum += a[r][c];
                }
                if (rowSum != magicSum) {
                    isMagicSquare = false;
                    break;
                }
            }
// Check columns
            for (int c = 0; c < a[0].length; c++) {
                int colSum = 0;
                for (int r = 0; r < a.length; r++) {
                    colSum += a[r][c];
                }
                if (colSum != magicSum) {
                    isMagicSquare = false;
                    break;
                }
            }
            // Check diagonals
            int diag1Sum = 0;

            for (int i = 0; i < a.length; i++) {
                diag1Sum += a[i][i];
            }
            if (diag1Sum != magicSum) {
                isMagicSquare = false;
            }
            int diag2Sum = 0;
            for (int i = 0; i < a.length; i++) {
                diag2Sum += a[i][a.length - 1 - i];
            }
            if (diag2Sum != magicSum) {
                isMagicSquare = false;
            }
            //Print result
if (isMagicSquare) {
                System.out.println("The array is a magic square.");
            } else {
                System.out.println("The array is not a magic square.");
        }
    }
}
    