import java.util.Scanner;

public class StudyCaseNestedLoop23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int jumlahBaris = scanner.nextInt();
        int k=1;
        for (int i = 1; i <= jumlahBaris; i++) {
            for (int j = 1; j <= jumlahBaris; j++) {
                if (j==jumlahBaris || j==1||j==k ) {
                    System.out.print("N ");
                } else {
                    System.out.print(" ");
                }
            }
            k++;
            System.out.println();
        }
    }
}
