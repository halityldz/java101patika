import java.util.Scanner;

public class notortalamasi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplamNot = 0;
        int dersSayisi = 6; // 6 ders var

        String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int[] notlar = new int[dersSayisi];

        for (int i = 0; i < dersSayisi; i++) {
            System.out.print(dersler[i] + " notunu girin: ");
            notlar[i] = scanner.nextInt();
            toplamNot += notlar[i];
        }

        scanner.close();


        double ortalama = (double) toplamNot / dersSayisi;
        String sinifDurumu = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Notların Ortalaması: " + ortalama);
        System.out.println("Sonuç: " + sinifDurumu);


    }
}
