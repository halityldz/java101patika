import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürünün fiyatını girin: ");
        double urunFiyati = scanner.nextDouble();

        double kdvOrani;
        if (urunFiyati >= 0 && urunFiyati <= 1000) {
            kdvOrani = 0.20; // %20 KDV
        } else {
            kdvOrani = 0.08; // %8 KDV
        }

        double kdvTutari = urunFiyati * kdvOrani;
        double kdvliFiyat = urunFiyati + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + urunFiyati + " TL");
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");

        scanner.close();

    }
}
