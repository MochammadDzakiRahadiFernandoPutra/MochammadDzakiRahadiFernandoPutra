import java.util.Scanner;

public class belahketupat {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukan diagonal 1");
        int d1 = input.nextInt();
        System.out.println("masukan diagonal 2");
        int d2 = input.nextInt();
        double konstanta=0.5;
        double hasil = konstanta*d1*d2;
        System.out.println("hasil luas belahketupat: "+hasil);
    }
}
