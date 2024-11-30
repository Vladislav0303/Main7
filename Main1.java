public class Main1 {
    public static void main(String[] args) {
        int[][] mass = new int[3][];
        mass[0] = new int[2];
        mass[1] = new int[3];
        mass[2] = new int[4];

        mass[0][0] = 3;
        mass[0][1] = 4;

        mass[1][0] = 2;
        mass[1][1] = 5;
        mass[1][2] = 6;

        mass[2][0] = 3;
        mass[2][1] = 1;
        mass[2][2] = 1;
        mass[2][3] = 1;
        System.out.println("Масив: ");
        for(int i = 0; i < mass.length; ++i) {
            for(int y = 0; y < mass[i].length; ++y) {
                System.out.print(mass[i][y] + " ");

        }
            System.out.println();
        }
        System.out.println(mass[2][3] + " " + mass[2][2] + " " + mass[2][1] + " " + mass[2][0]);
        System.out.println(mass[1][2] + " " + mass[1][1] + " " + mass[1][0]);
        System.out.println(mass[0][1] + " " + mass[0][0]);

    }
}