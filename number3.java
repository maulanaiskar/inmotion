import java.math.BigInteger;
import java.util.Scanner;

public class faktorial {
    public static BigInteger factorial(int angka) {
        BigInteger hasil = new BigInteger("1");
        for (int i = angka; i >= 1; i--)
            hasil = hasil.multiply(BigInteger.valueOf(i));
        return hasil;

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int a = scanner.nextInt();
        if (a <= 1 || a > 100) {
            System.out.print("Input Salah, Angka Tidak Sesuai");
        } else {
            BigInteger hasil = factorial(a);
            System.out.print(hasil);
        }
    }

}
