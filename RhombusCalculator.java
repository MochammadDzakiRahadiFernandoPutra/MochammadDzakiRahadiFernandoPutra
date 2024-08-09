RhombusDiagonalCalculator.java
import java.util.Scanner;

public class RhombusCalculator {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan panjang diagonal utama (dalam satuan panjang): ");
        double d1 = scanner.nextDouble();

        System.out.print("Masukkan panjang diagonal sekunder (dalam satuan panjang): ");
        double d2 = scanner.nextDouble();

        // Menghitung panjang sisi belah ketupat
        double side = Math.sqrt((d1 * d1 + d2 * d2) / 4);

        // Menampilkan hasil
        System.out.printf("Panjang sisi belah ketupat adalah: %.2f\n", side);

        // Menutup scanner
        scanner.close();
        javac RhombusCalculator.java
        java RhombusCalculator
    }
}