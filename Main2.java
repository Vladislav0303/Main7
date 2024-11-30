import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        double[][] mass = new double[4][4];
        for(int i = 0; i < mass.length; ++i) {
            for(int j = 0; j < mass.length; ++j) {
                Random random = new Random();
                mass[i][j] = random.nextDouble(0,3.5);
                if(i % 3 == 0 && j % 3 == 0 ) {
                    System.out.print(" Непарні: [" + i + "]["+ j + "]: " + Math.sqrt(mass[i][j]));
                }else if(i % 2 == 0 && j % 2 == 0) {
                    System.out.print(" Парні: [" + i + "][" + j + "]: " + mass[i][j]);
                }else {
                    System.out.print(" Парні: [" + i + "]["+ j + "]: " + Math.sqrt(mass[i][j]));
                }
            }
            System.out.println();
        }
    }
}
