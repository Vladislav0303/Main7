import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Введіть числа для матриці [" + i + "]["+ j + "]:\n");
                matrix[i][j] = sc.nextInt();

            }
        }
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[i].length; ++j) {
                System.out.print(" " + matrix[i][j]);
            }
            int a = matrix[0][0] * matrix[1][1] * matrix[2][2] * matrix[3][3] * matrix[4][4];
            int b = matrix[4][0] * matrix[3][1] * matrix[2][2] * matrix[1][3] * matrix[0][4];
            int d = a - b;
            System.out.println(" Визначник: " + d);

        }
    }
}
