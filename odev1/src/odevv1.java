import java.util.Scanner;

public class odevv1 {
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        double boy;
        double kilo;
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy=giris.nextDouble();
        System.out.println("lütfen kilonuzu giriniz: ");
        kilo=giris.nextDouble();
        double vucutKitleEndeksi=kilo/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz = "+vucutKitleEndeksi);
    }
}
