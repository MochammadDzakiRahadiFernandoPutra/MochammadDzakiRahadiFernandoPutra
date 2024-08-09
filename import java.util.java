import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menampilkan menu pilihan
        System.out.println("Pilih opsi:");
        System.out.println("1. Hitung radius dari luas lingkaran");
        System.out.println("2. Hitung luas lingkaran dari radius");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Opsi 1: Menghitung radius dari luas
            System.out.print("Masukkan luas lingkaran (dalam satuan kuadrat): ");
            double area = scanner.nextDouble();
            double radius = Math.sqrt(area / Math.PI);
            System.out.printf("Radius lingkaran adalah: %.2f\n", radius);
        } else if (choice == 2) {
            // Opsi 2: Menghitung luas dari radius
            System.out.print("Masukkan radius lingkaran: ");
            double radius = scanner.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.printf("Luas lingkaran adalah: %.2f\n", area);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        // Menutup scanner
        scanner.close();
        javac CircleCalculator.java
        java CircleCalculator

    }
}