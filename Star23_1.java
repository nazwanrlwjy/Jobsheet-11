import java.util.Scanner;
public class Star23_1 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc23.nextInt();

        for(int i=0; i<=N; i++){
            System.out.print("*");
        }
    }
}