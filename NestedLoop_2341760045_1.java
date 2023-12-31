import java.util.Scanner;

public class NestedLoop_2341760045_1 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke- " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + i) + " : ");
                temps[i][j] = sc23.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }
}