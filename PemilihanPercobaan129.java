import java.util.Scanner;
public class PemilihanPercobaan129 {
    
    public static void main(String[] args) {
        Scanner input29 =new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input29.nextInt();

        String jenisBilangan = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " adalah bilangan " + jenisBilangan);
    }
}