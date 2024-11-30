import java.util.Random;

public class Main5 {
    public static void main(String[] args) {
        Random random = new Random();
    int[][] matrix = new int[4][4];
    for(int i = 0; i < matrix.length; ++i) {
       for(int j = 0; j <matrix[i].length; ++j) {
          matrix[i][j] = random.nextInt(0,30);
          System.out.print(" " + matrix[i][j]);
          }
       System.out.println();
       }
        for(int i = 0; i < matrix.length; ++i) {
            for(int j = 0; j < matrix[i].length; ++j) {
                if(i == 0 && i <= j) {
                    matrix[i][j] = matrix[j][i];
                    System.out.print("[" + matrix[i][j] + "]");
                }else if(i == 1 && i <= j) {
                    matrix[i][j] = matrix[j][i];
                    System.out.print("[" + matrix[i][j] + "]");
            }
            }
            System.out.println();
        }
    }
}
