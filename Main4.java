import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть розмір матриці: ");
        int n = sc.nextInt();

        int[][] matrix = generateMatrix(n);
        printMatrix(matrix);

        System.out.print("Рядок (1-" + n + "): ");
        int row = sc.nextInt() - 1;
        System.out.print("Стовпець (1-" + n + "): ");
        int col = sc.nextInt() - 1;

        int minor = calculateDeterminant(getSubMatrix(matrix, row, col));
        System.out.println("Мінор: " + minor);
    }

    private static int[][] generateMatrix(int n) {
        Random rnd = new Random();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = rnd.nextInt(10);
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) System.out.print(value + " ");
            System.out.println();
        }
    }

    private static int[][] getSubMatrix(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int[][] sub = new int[n - 1][n - 1];
        for (int i = 0, si = 0; i < n; i++) {
            if (i == row) continue;
            for (int j = 0, sj = 0; j < n; j++) {
                if (j == col) continue;
                sub[si][sj++] = matrix[i][j];
            }
            si++;
        }
        return sub;
    }

    private static int calculateDeterminant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) return matrix[0][0];
        if (n == 2) return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        int det = 0;
        for (int i = 0; i < n; i++) {
            det += (i % 2 == 0 ? 1 : -1) * matrix[0][i] * calculateDeterminant(getSubMatrix(matrix, 0, i));
        }
        return det;
    }
}

