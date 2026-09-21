import java.util.Scanner;

public class Solver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bagian input sandi
        System.out.print("Masukkan sandi yang ingin dipecahkan: ");
        String SandiAND = scanner.nextLine();

        // Bagian pemecahan sandi
        String HasilSandiAND = SandiAND.replace("AND", "");

        // Bagian output pemecahan sandi
        System.out.println("Hasil pemecahan sandi adalah: " + HasilSandiAND);

        scanner.close();
    }
}
